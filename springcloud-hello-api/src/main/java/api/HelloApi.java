package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/7 上午11:42
 **/
public interface HelloApi {

    /**
     * @param name
     * @return
     */
    //这里指定调用的rest URL
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}
