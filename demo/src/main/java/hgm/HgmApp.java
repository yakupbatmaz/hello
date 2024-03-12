package hgm;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HgmApp {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println(HgmApp.class.getSimpleName() + " başlatıldı.");
    }
}
