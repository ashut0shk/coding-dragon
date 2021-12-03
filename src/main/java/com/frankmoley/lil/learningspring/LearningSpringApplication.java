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

@SpringBootApplication
public class LearningSpringApplication {

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
    }

}
