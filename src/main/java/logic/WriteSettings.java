package logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSettings {


    public static void startWrite() throws IOException {
        String path = "C:\\Program Files (x86)\\FSR Launcher\\SubApps\\CScalp\\Data\\MVS\\";

        for (DataCrypto name : ParserAPI.dataCryptoList) {
            File fileSpot = new File(path + "BINAD.CCUR." + name.getNameCrypto() + "_Settings_.tmp");
            File fileFut = new File(path + "BINAD.CCUR_FUT." + name.getNameCrypto() + "_Settings_P5a4B.tmp");
            //Записываем данные для спот стакана
            if (fileSpot.createNewFile()) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileSpot))) {
                    writer.write(name.getSetting());
                    System.out.println(name.getNameCrypto() + " - SPOT ok!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Файл создан, данные записаны.");
            } else {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileSpot))) {
                    writer.write(name.getSetting());
                    System.out.println(name.getNameCrypto() + " - SPOT ok!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //Записываем данные для фьючерс стакана
            if (fileFut.createNewFile()) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileFut))) {
                    writer.write(name.getSetting());
                    System.out.println(name.getNameCrypto() + " - FUTURES ok!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Файл создан, данные записаны.");
            } else {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileFut))) {
                    writer.write(name.getSetting());
                    System.out.println(name.getNameCrypto() + " - FUTURES ok!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}