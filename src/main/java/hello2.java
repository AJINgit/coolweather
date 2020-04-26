import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello2 {
    @ResponseBody
    @RequestMapping("hello2")
    public String hell02(){
        return "hello2";
    }
}
