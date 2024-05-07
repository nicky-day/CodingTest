package org.example.programmers.sort;

import java.util.*;
import java.util.stream.Collectors;

class 메뉴_리뉴얼 {
    private static class Course {
        public final String course;
        public final int occurrences;

        public Course(String course, int occurrences) {
            this.course = course;
            this.occurrences = occurrences;
        }
    }

    private void getCourses(char nextMenu, Set<String> selectedMenus,
                            List<Set<String>> orderList,
                            Map<Integer, List<Course>> courses) {

        // selectedMenus가 orderList에 몇 번 등장하는지 검사
        int occurrences = (int) orderList.stream()
                .filter(order -> order.containsAll(selectedMenus))
                .count();

        // 등장 횟수가 2회 미만이면 메뉴를 더 추가해도 등장 횟수가 2회 이상이 될 수 없다.
        if (occurrences < 2) return;

        // 포함된 메뉴 개수를 구한다.
        int size = selectedMenus.size();

        // courses의 key에 size가 포함되었는지 검사한다.
        if (courses.containsKey(size)) {
            List<Course> courseList = courses.get(size);

            // 코스에는 메뉴가 알파벳 순으로 포함되어야 한다.
            Course course = new Course(selectedMenus.stream()
                    .sorted()
                    .collect(Collectors.joining("")),
                    occurrences);

            // 코스는 무조건 채택되는 것이 아닌 기존에 찾은 다른 코스들과 비교해서 등장 횟수가 같거나 더 많을 때에만 저장해야 한다.
            Course original = courseList.get(0);

            // course와 original의 등장 횟수를 비교하여 course의 등장 횟수가 더 많다면
            // 기존에 찾은 코스들은 모두 버리고 course를 추가해야 한다.
            // 두 등장 횟수가 같다면 기존 코스는 유지한채 course를 추가한다.
            if (original.occurrences < occurrences) {
                courseList.clear();
                courseList.add(course);
            } else if (original.occurrences == occurrences) {
                courseList.add(course);
            }
        }

        // 포함된 메뉴가 10개 이상이면 더 이상 메뉴를 포함시킬 수 없다.
        if (size >= 10) return;
        for (char menuChar = nextMenu; menuChar <= 'Z'; menuChar++) {
            String menu = String.valueOf(menuChar);
            selectedMenus.add(menu);
            // 재귀를 진행하여 다음 조합을 찾아본다.
            getCourses((char) (menuChar + 1), selectedMenus, orderList, courses);
            selectedMenus.remove(menu);
        }
    }

    public String[] solution(String[] orders, int[] course) {
        List<Set<String>> orderList = Arrays.stream(orders)
                .map(String::chars)
                .map(charStream -> charStream
                        .mapToObj(menu -> String.valueOf((char) menu))
                        .collect(Collectors.toSet()))
                .collect(Collectors.toList());

        Map<Integer, List<Course>> courses = new HashMap<>();
        for (int length : course) {
            List<Course> list = new ArrayList<>();
            list.add(new Course("", 0));
            courses.put(length, list);
        }
        getCourses('A', new HashSet<>(), orderList, courses);

        return courses.values().stream()
                .filter(list -> list.get(0).occurrences > 0)
                .flatMap(List::stream)
                .map(c -> c.course)
                .sorted()
                .toArray(String[]::new);
    }
}

class Main7 {
    public static void main(String[] args) {
        메뉴_리뉴얼 problem = new 메뉴_리뉴얼();
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        System.out.println(Arrays.toString(problem.solution(orders, course)));
    }
}
