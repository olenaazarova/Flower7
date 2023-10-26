package ucu.edu.ua.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/flowers/")

public class FlowerController {
    @GetMapping("list")
    public List<Flower> hello() {
        return List.of(new Flower(4, FlowerColor.BLUE, 6), new Flower(5, FlowerColor.RED, 6));
    }

}
