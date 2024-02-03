package edu.adrian_gradilla.reto2;
import edu.adrian_gradilla.reto2.ui.CLI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            /*Mando llamar la clase Cli y el metodo show menu para mostrar el menu principal.*/
            new CLI();
            new Scanner(System.in);
            CLI.showmenu();

    }
}
