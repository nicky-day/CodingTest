package org.example.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class 나이순_정렬 {
}

class Profile implements Comparable<Profile> {

    private int order;
    private int age;
    private String name;

    public Profile(int order, int age, String name) {
        this.order = order;
        this.age = age;
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Profile profile) {
        if (this.age != profile.age)
            return this.age - profile.age;
        return this.order - profile.order;
    }
}

class Main3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Profile> profileList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            profileList.add(
                    new Profile(
                            i,
                            Integer.parseInt(input[0]),
                            input[1]
                    )
            );
        }

        profileList.sort((profile1, profile2) -> {
            if (profile1.getAge() == profile2.getAge()) {
                return profile1.getOrder() - profile2.getOrder();
            } else {
                return profile1.getAge() - profile2.getAge();
            }
        });

        profileList.forEach(
                profile -> System.out.println(profile.getAge() + " " + profile.getName())
        );
    }
}

class Main3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Profile[] profiles = new Profile[N];
        for (int i = 0; i < N; i++)
            profiles[i] = new Profile(i, sc.nextInt(), sc.next());

        Arrays.sort(profiles);

        for (Profile profile : profiles)
            System.out.println(profile.getAge() + " " + profile.getName());
    }
}
