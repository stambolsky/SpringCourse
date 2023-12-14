package springCourses.Lesson12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextLesson12.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        /*ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        // @Scope("singleton")
        // classicalMusic1 == classicalMusic2 - true
        // @Scope("prototype")
        // classicalMusic1 == classicalMusic2 - false
        System.out.println(classicalMusic1 == classicalMusic2);*/

        //@PostConstruct and @PreDestroy
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        context.close();
    }
}
