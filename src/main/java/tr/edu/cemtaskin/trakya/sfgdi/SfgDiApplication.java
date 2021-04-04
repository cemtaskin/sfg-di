package tr.edu.cemtaskin.trakya.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}
