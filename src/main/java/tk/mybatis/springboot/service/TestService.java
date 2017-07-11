package tk.mybatis.springboot.service;

import org.assertj.core.util.Preconditions;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by hanaijun on 2017/7/11.
 */
@Service
public class TestService {


    public static void zzz(){
        Optional<Integer> possible = Optional.of(5);
        System.out.println(possible.isPresent());

        String inputName = "iamzhongyong";
        Preconditions.checkArgument(inputName!=null && !"".equals(inputName),"input is null");

    }

    public static void main(String[] args) {
        zzz();
    }
}
