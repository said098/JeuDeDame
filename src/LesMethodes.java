public class LesMethodes {
    public static void affichePlateau(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print("|");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
                System.out.print("|");
            }
            System.out.println();
            for (int j = 0; j < tab[i].length; j++) {  //les tiré en bas de chaque lignes
                System.out.print(" _");
            }
            System.out.println("");
        }
    }

    public static void remplirTableaux(char[][] tab) {
        for (int ligne = 0; ligne < tab.length; ligne++) {
            for (int colonne = 0; colonne < tab[ligne].length; colonne++) {
                if (ligne >= 0 && ligne <= 3) {
                    if (ligne % 2 == 0) {
                        if (colonne % 2 == 0)
                          tab[ligne][colonne] =' ';
                        else
                            tab[ligne][colonne] ='B';
                    }
                    else if ((ligne % 2 != 0)){
                        if (colonne % 2 == 0)
                            tab[ligne][colonne] ='B';
                        else
                            tab[ligne][colonne] =' ';
                    }


                }
                if (ligne >= 6 && ligne <= tab.length) {
                    if (ligne % 2 == 0) {
                        if (colonne % 2 == 0)
                            tab[ligne][colonne] =' ';
                        else
                            tab[ligne][colonne] ='B';
                    }
                    else if ((ligne % 2 != 0)){
                        if (colonne % 2 == 0)
                            tab[ligne][colonne] ='B';
                        else
                            tab[ligne][colonne] =' ';
                    }


                }

            }

                /*if(ligne >=0 && ligne<=3){
                    if(colonne%2!=0){
                        tab[ligne][colonne] = 'X';
                    }
                    else{
                        tab[ligne][colonne] = ' ';
                    }
                }
                if(ligne >=6 && ligne<=tab.length){
                    if(colonne%2==0){
                        tab[ligne][colonne] = '0';
                    }
                    else{
                        tab[ligne][colonne] = ' ';
                    }
                }*/

        }
        System.out.println();
    }


    public static void main(String[] args) {
        char[][] tab = new char[10][10];
        remplirTableaux(tab);
        affichePlateau(tab);
        // afficherDamier(10,10);
    }
}
