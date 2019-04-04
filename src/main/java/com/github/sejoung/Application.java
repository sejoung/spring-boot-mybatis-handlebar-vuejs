package com.github.sejoung;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    //한글[UTF8]처리
    System.setProperty("file.encoding","UTF-8");

    try {
      Field charset = Charset.class.getDeclaredField("defaultCharset");
      charset.setAccessible(true);
      charset.set(null, null);
    }catch(Exception e){
      System.out.println("Charset 오류 : " + e.getStackTrace());
    }

    SpringApplication.run(Application.class, args);
  }

}
