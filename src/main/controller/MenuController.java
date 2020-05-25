package main.controller;

import com.alibaba.fastjson.JSON;
import main.entity.MenuAvailablity;
import main.entity.MenuPrice;
import main.views.ModifyPrice;
import main.views.Modifyavaliable;

import java.io.*;

/**
 * This class is used for the menu. It contains alla the function of the menu.
 * Including set availability and price of the menu
 * @ClassName MenuController
 * @author Yuxuan Wu and Kai Yan
 * @version 3.0
 * @date 2020/05/20
 */
public class MenuController {

    /**
     * Initialize the Menu Price info to the file. (Only use for the first time)
     * @author Yuxuan Wu
     * @date 2020/04/05
     */
    public static void genMenuPriceInfo() {
        MenuPrice menuPrice = new MenuPrice();
        FileWriter fileWriter;
        File file = new File(UtilsController.MENU_PRICE_ADDR);
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
     * Invoked by the views to get the price
     * @param newMenuPrice
     * @author Yuxuan Wu
     * @date 2020/05/01
     */
    public static void updateMenuPriceInfo(MenuPrice newMenuPrice) {
        FileWriter fileWriter;
        File file = new File(UtilsController.MENU_PRICE_ADDR);
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
     * Get the Menu Price infos from the files.
     * @return menuPrice
     * @author Yuxuan Wu
     * @date 2020/05/01
     */
    public static MenuPrice getMenuPriceInfo() {
        FileReader fileReader;
        File file = new File(UtilsController.MENU_PRICE_ADDR);
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
     * Generate the menu availability infos to the file.
     * @exception IOException
     * @author Yuxuan Wu
     * @date 2020/05/01
     */
    public static void genMenuAvailabilityInfo() {
        MenuAvailablity menuAvailablity = new MenuAvailablity();
        FileWriter fileWriter;
        File file = new File(UtilsController.MENU_AVAILABALITY_ADDR);
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
     * Write the new menu availablity infos to the file
     * @param newMenuAvailablity
     * @exception IOException
     * @author Yuxuan Wu
     * @date 2020/05/01
     */
    public static void updateMenuAvailabilityInfo(MenuAvailablity newMenuAvailablity) {
        FileWriter fileWriter;
        File file = new File(UtilsController.MENU_AVAILABALITY_ADDR);
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
     * Read the menu availability info from the file
     * @return MenuAvailability
     * @author Yuxuan Wu
     * @date 2020/05/01
     */
    public static MenuAvailablity getMenuAvailabilityInfo() {
        FileReader fileReader;
        File file = new File(UtilsController.MENU_AVAILABALITY_ADDR);
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


    /**
     * Get the Menu Price from View
     * @param modifyPrice
     * @return MenuPrice
     * @author Yuxuan Wu
     * @
     */
    public static MenuPrice getMenuPriceFromView(ModifyPrice modifyPrice) {
        MenuPrice newMenu = new MenuPrice();
        newMenu.setFixedPrice(Double.parseDouble(modifyPrice.RamenNowPrice.getText()));
        newMenu.setExtraNoriPrice(Double.parseDouble(modifyPrice.ChashuNowPrice.getText()));
        newMenu.setExtraBamShootPrice(Double.parseDouble(modifyPrice.BambooshootsNowPrice.getText()));
        newMenu.setExtraBoilEggPrice(Double.parseDouble(modifyPrice.BoiledeggNowPrice.getText()));
        newMenu.setExtraChashuPrice(Double.parseDouble(modifyPrice.ChashuNowPrice.getText()));
        return newMenu;
    }

    /**
     * Get the Menu Ability from View
     * @param modifyavaliable
     * @return MenuAvailability
     * @author Kai Yan
     * @date 2020/05/01
     */
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

    /**
     * Combination of the methods, update the menu Price
     * @param modifyPrice
     * @author Yuxuan Wu
     * @date 2020/05/07
     */
    public static void updateMenuPriceFiles(ModifyPrice modifyPrice) {
        updateMenuPriceInfo(getMenuPriceFromView(modifyPrice));
    }
    /**
     * Combination of the methods, update the menu Availability
     * @param modifyavaliable
     * @author Yuxuan Wu
     * @date 2020/05/07
     */
    public static void updateMenuAvailabilityFiles(Modifyavaliable modifyavaliable) {
        updateMenuAvailabilityInfo(getMenuAvailablityFromView(modifyavaliable));
    }


    public static void main(String[] args) {
        genMenuPriceInfo();
        genMenuAvailabilityInfo();
    }
}
