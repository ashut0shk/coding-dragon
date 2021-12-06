package com.frankmoley.lil.learningspring;

import com.frankmoley.lil.learningspring.data.entity.*;
import com.frankmoley.lil.learningspring.data.repository.GuestRepository;
import com.frankmoley.lil.learningspring.data.repository.ReservationRepository;
import com.frankmoley.lil.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
import java.util.Scanner;

@SpringBootApplication
public class LearningSpringApplication {
    public static long oldFactorial(int i){
        if (i < 2) return 1;
        return (i * oldFactorial(i-1));
    }

    public static long peralta(int i, int a, int b){
        long mod = 1000000007L;
        if(i < 2) return 1;
        return ((a*peralta(i-1,a,b)) + (b * peralta(i-2, a, b)))%mod;
    }
    // Returns Factorial of N
    static BigInteger factorial(int N) {
        // Initialize result
        BigInteger f
                = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearningSpringApplication.class, args);
        //context is the bean factory, and all the beans created at the start of the program can be fetched from beanfactory.
        User user = context.getBean(User.class);
        System.out.println(user);

        Test test = context.getBean(Test.class);
        System.out.println(test);

        Resell resell = context.getBean(Resell.class, 21, 5, 1);
        Resell resell1 = context.getBean(Resell.class, 10, 2, 1);
        Resell resell2 = context.getBean(Resell.class, 10, 3, 1);
        Resell resell3 = context.getBean(Resell.class, 3, 5, 1);
        Resell resell4 = context.getBean(Resell.class, 9, 0, 1);

        System.out.println(resell);
        System.out.println(resell1);
        System.out.println(resell2);
        System.out.println(resell3);
        System.out.println(resell4);

        int i = 99;
        int a = 5;
        int b = 6;
        System.out.println(factorial(i));
        // System.out.println(peralta(i, a, b));
        // isPasswordComplex("Password");
        // isPasswordComplex("Password1");
        // isPasswordComplex("PASSWORD1");
        String s="Sachin";
        System.out.println(s.concat(" Tendulkar"));//will print Sachin because strings are immutable objects

        String s1="Sachin";
        String s2="Sachin";
        String s3="Ratan";
        String s4= new String("Sachin"); //redundant
        String s5= new String(s4); //redundant
        System.out.println(s1.compareTo(s2));//0 //ignore
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s1.compareTo(s4));//-1(because s3 < s1 )
        System.out.println(s4.compareTo(s5)); //0
        System.out.println(s1.compareTo(s5)); //0
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
        String s11="true";
        String s22="TRue";
        String s33="ok";
        boolean b1=Boolean.parseBoolean(s11); //always true
        boolean b2=Boolean.parseBoolean(s22); //always true
        boolean b3=Boolean.parseBoolean(s33); //always false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

}
