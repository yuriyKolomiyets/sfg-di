package guru.springframework.sfgdi.controlers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SettingInjectedControllerTest {

    SettingInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SettingInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}