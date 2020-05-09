import com.liutao.MessageApp;
import com.liutao.test.Send;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/9 下午1:43
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MessageApp.class)
public class SendTest {
    @Autowired
    private Send sender;

    @Test
    public void testSend() {
        sender.sendMsg("hello liutao");
    }
}