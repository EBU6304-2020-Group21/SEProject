package main.controller;

import com.alibaba.fastjson.JSON;
import main.entity.MenuAvailablity;
import main.entity.MenuPrice;
import main.views.ModifyPrice;
import main.views.Modifyavaliable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

/**
 * <h3>SEProject</h3>
 * <p>The controller for the menu</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-05-07 20:19
 **/
public class MenuController {
    /**
     * @description 用于进行第一次菜单价格文件生成的初始化操作，不用运行
     */
    public static void genMenuPriceInfo() {
        MenuPrice menuPrice = new MenuPrice();
        FileWriter fileWriter;
        File file = new File("Files/Menu/MenuPrice.json");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(JSON.toJSONString(menuPrice));
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param newMenuPrice
     * @description 用于前端调用，更新菜单价格信息
     */
    public static void updateMenuPriceInfo(MenuPrice newMenuPrice) {
        FileWriter fileWriter;
        File file = new File("Files/Menu/MenuPrice.json");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(JSON.toJSONString(newMenuPrice));
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return
     * @description 用于从文件中得到实体的信息，需要传到前端
     */
    public static MenuPrice getMenuPriceInfo() {
        FileReader fileReader;
        File file = new File("Files/Menu/MenuPrice.json");
        BufferedReader reader = null;
        String readString = "";
        MenuPrice menuPrice = new MenuPrice();
        try {
            if (!file.exists()) {
                System.out.println("The file doesn't exists!");
                file.createNewFile();
            }
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                readString += tempString;
            }
            menuPrice = JSON.parseObject(readString, MenuPrice.class);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return menuPrice;
    }

    /**
     * @description 用于第一次生成菜单可选项的初始化操作，现在不用运行
     */
    public static void genMenuAvailabilityInfo() {
        MenuAvailablity menuAvailablity = new MenuAvailablity();
        FileWriter fileWriter;
        File file = new File("Files/Menu/MenuAvailability.json");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(JSON.toJSONString(menuAvailablity));
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param newMenuAvailablity
     * @description 用于将前端修改后的信息写进文件中，传入相应实体类
     */
    public static void updateMenuAvailabilityInfo(MenuAvailablity newMenuAvailablity) {
        FileWriter fileWriter;
        File file = new File("Files/Menu/MenuAvailability.json");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(JSON.toJSONString(newMenuAvailablity));
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return MenuAvailability()
     * @description 用于从文件中读取菜单可选项信息
     */
    public static MenuAvailablity getMenuAvailabilityInfo() {
        FileReader fileReader;
        File file = new File("Files/Menu/MenuAvailability.json");
        BufferedReader reader = null;
        String readString = "";
        MenuAvailablity menuAvailablity = new MenuAvailablity();
        try {
            if (!file.exists()) {
                System.out.println("The file doesn't exists!");
                file.createNewFile();
            }
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                readString += tempString;
            }
            //System.out.println(readString);
            menuAvailablity = JSON.parseObject(readString, MenuAvailablity.class);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return menuAvailablity;
    }



    public static MenuPrice getMenuPriceFromView(ModifyPrice modifyPrice) {
        MenuPrice newMenu = new MenuPrice();
        newMenu.setFixedPrice(Double.parseDouble(modifyPrice.RamenNowPrice.getText()));
        newMenu.setExtraNoriPrice(Double.parseDouble(modifyPrice.ChashuNowPrice.getText()));
        newMenu.setExtraBamShootPrice(Double.parseDouble(modifyPrice.BambooshootsNowPrice.getText()));
        newMenu.setExtraBoilEggPrice(Double.parseDouble(modifyPrice.BoiledeggNowPrice.getText()));
        newMenu.setExtraChashuPrice(Double.parseDouble(modifyPrice.ChashuNowPrice.getText()));
        return newMenu;
    }

    public static MenuAvailablity getMenuAvailablityFromView(Modifyavaliable modifyavaliable) {
        MenuAvailablity newAvailablity = new MenuAvailablity();
        newAvailablity.setRamenAvailable(modifyavaliable.RamenAvaliable.isSelected());
        newAvailablity.setBamShootAvailable(modifyavaliable.BambooshootsAvaliable.isSelected());
        newAvailablity.setBoilEggAvailable(modifyavaliable.BoiledeggAvaliable.isSelected());
        newAvailablity.setChashuAvailable(modifyavaliable.ChashuAvaliable.isSelected());
        newAvailablity.setNoriAvailable(modifyavaliable.NoriAvaliable.isSelected());
        newAvailablity.setShioAvailable(modifyavaliable.ShioAvaliable.isSelected());
        newAvailablity.setShoyuAvailable(modifyavaliable.ShoyuAvaliable.isSelected());
        newAvailablity.setTonkotsuAvailable(modifyavaliable.TonkostuAvaliable.isSelected());
        return newAvailablity;
    }

    //输入确认完成后，将其写入后端，GUIModel直接调用下面这两个方法
    public static void updateMenuPriceFiles(ModifyPrice modifyPrice) {
        updateMenuPriceInfo(getMenuPriceFromView(modifyPrice));
    }

    public static void updateMenuAvailabilityFiles(Modifyavaliable modifyavaliable) {
        updateMenuAvailabilityInfo(getMenuAvailablityFromView(modifyavaliable));
    }


    public static void main(String[] args) {
        genMenuPriceInfo();
        genMenuAvailabilityInfo();
    }
}
