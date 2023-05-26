package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final String ROOT = "root";

        final String FURNITURE = "Furniture";
        final String ELECTRONICS = "Electronics";
        final String HOME_APPLI = "Home Appliances";

        final String MAJOR_APPLI = "Major Appliances";
        final String MINOR_APPLI = "Minor Appliances";
        final String LAWN_GARDEN = "Lawn & Garden";

        final String KITCHEN_APPLI = "Kitchen Appliances";
        final String GENERAL_APPLI = "General Appliances";

        //Create the nodes of the Tree
        Category sqRoot = new Category(ROOT,null);
        Category furniture = new Category(FURNITURE,sqRoot);
        Category electronic = new Category(ELECTRONICS,sqRoot);
        Category homeAppli= new Category(HOME_APPLI,sqRoot);
        //Create the sub childs
        Category majorAppli = new Category(MAJOR_APPLI,homeAppli);
        Category minorAppli= new Category(MINOR_APPLI,homeAppli);
        Category lawnGarden = new Category(LAWN_GARDEN, homeAppli);
        //Create the sub, sub child
        Category kitchenAppli = new Category(KITCHEN_APPLI,majorAppli);
        Category generalAppli = new Category(GENERAL_APPLI, majorAppli);

        //Set keywords
        lawnGarden.setKeyWords(Arrays.asList("Lawn", "Garden", "GardeningTools"));
        majorAppli.setKeyWords(Arrays.asList("If I see this means that is the keywords of the parent"));
        //Set the structure of the tree
        //first level
        sqRoot.addChild(furniture);
        sqRoot.addChild(electronic);
        sqRoot.addChild(homeAppli);
        //second level
        homeAppli.addChild(majorAppli);
        homeAppli.addChild(minorAppli);
        homeAppli.addChild(lawnGarden);
        //third level
        majorAppli.addChild(kitchenAppli);
        majorAppli.addChild(generalAppli);

        System.out.println("keywords of lawnGarden: "+lawnGarden.getKeyWords());
        System.out.println("Level of of lawnGarden: "+lawnGarden.getLevel());
        System.out.println("keywords of the parent of kitchenAppli: "+ kitchenAppli.getKeyWords());

    }
}