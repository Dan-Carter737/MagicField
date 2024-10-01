import java.util.Scanner;

public class Main {

    public static int choosing() {
        int templ = (int) (Math.random() * 4);
        ;

        if (templ == 0) {
            templ = 1;
            ;
        }
        return templ;
    }

    public static void main(String[] args) {

        String firstWord = "Самолет"; // randomSelection 1
        String secondWord = "Поезд";  //  randomSelection 2
        String thirdWord = "Автомобиль"; //  randomSelection 3

        // datas for the choosing method;
        int randomSelection1 = 1;
        int randomSelection2 = 2;
        int randomSelection = 3;

        int lettersFail = 0;
        int wordFail = 0;

        //Letters for the whole WORD
        char letterWord1 = '*';
        char letterWord2 = '*';
        char letterWord3 = '*';
        char letterWord4 = '*';
        char letterWord5 = '*';
        char letterWord6 = '*';
        char letterWord7 = '*';
        char letterWord8 = '*';
        char letterWord9 = '*';
        char letterWord10 = '*';

        boolean letterCountCheck = false; // check for else status in order ont to have problems with chances


        int computerSelection = choosing();

        System.out.println(computerSelection);

        int guessMethod;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Какое слово загадал компьютер? Можно угадывать по буквам или попробовать угадать все слово целиком, при этом, в случае, если выбран вариант \"по буквам\", то вам дается всего три попытки, а если \"слово целиком\" - не более шести!\n");
        if (computerSelection == 1) {
            System.out.println("Подсказка: Вид транспортного средства, который может передвигаться по воздуху [*][*][*][*][*][*][*] ?");
        }
        if (computerSelection == 2) {
            System.out.println("Подсказка: один из видов рельсового транспорта [*][*][*][*][*] ?");
        }
        if (computerSelection == 3) {
            System.out.println("Подсказка: Вид безрельсового транспортного средства  [*][*][*][*][*][*][*][*][*][*] ?");
        }
        System.out.println("Какой способ хотите выбрать (введите соотвествующую цифру): 1 - по буквам, 2 - слово целиком, ваш выбор?\n");
        guessMethod = scanner.nextInt();

        switch (guessMethod) {
            case 1 -> {
                System.out.println("Вы выбрали метод отгадывания слова \"по буквам\"");

                do {
                    System.out.println("Введите букву: ");
                    Character templeLetter = scanner.next().charAt(0);

                    if (computerSelection == 1 && ((templeLetter == 'С') || (templeLetter == 'с' || templeLetter == 'а' || templeLetter == 'м'
                            || templeLetter == 'о' || templeLetter == 'л' || templeLetter == 'е'
                            || templeLetter == 'ё' || templeLetter == 'т' || templeLetter == 'А'
                            || templeLetter == 'М' || templeLetter == 'О' || templeLetter == 'Ё'
                            || templeLetter == 'Т'))) {

                        if (templeLetter == 'С' || templeLetter == 'с') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [C][*][*][*][*][*][*]");
                            letterWord1 = 'С';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }


                        } else if (templeLetter == 'а' || templeLetter == 'А') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][А][*][*][*][*][*]");
                            letterWord2 = 'А';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'м' || templeLetter == 'М') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][М][*][*][*][*]");
                            letterWord3 = 'М';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'о' || templeLetter == 'О') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][О][*][*][*]");
                            letterWord4 = 'О';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'л' || templeLetter == 'Л') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][*][Л][*][*]");
                            letterWord5 = 'Л';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'е' || templeLetter == 'Е' || templeLetter == 'ё' || templeLetter == 'Ё') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][*][*][Ё][*]");
                            letterWord6 = 'Ё';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'т' || templeLetter == 'Т') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][*][*][*][Т]");
                            letterWord7 = 'Т';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        }
                        if (letterWord1 == 'С' && letterWord2 == 'А' && letterWord3 == 'М' && letterWord4 == 'О' && letterWord5 == 'Л' && letterWord6 == 'Ё' && letterWord7 == 'Т') {
                            System.out.println("Поздравляем! Вы угадали слово по буквам!");
                            System.exit(0);
                        }
                    } else {
                        if (computerSelection == 1 && !letterCountCheck == false) {
                            System.out.println("К сожалениею, такой буквы нет в этом слове!");
                            lettersFail++;
                            System.out.println("У вас осталось " + (3 - lettersFail) + " попыток!");
                            if (3 - lettersFail == 0) {
                                System.exit(0);
                            }
                        }
                    }

                    //second
                    if (computerSelection == 2 && ((templeLetter == 'П') || (templeLetter == 'п' || templeLetter == 'О' || templeLetter == 'о'
                            || templeLetter == 'Е' || templeLetter == 'е' || templeLetter == 'З'
                            || templeLetter == 'з' || templeLetter == 'Д' || templeLetter == 'д'
                    ))) {

                        if (templeLetter == 'П' || templeLetter == 'п') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [П][*][*][*][*]");
                            letterWord1 = 'П';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'О' || templeLetter == 'о') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][О][*][*][*]");
                            letterWord2 = 'О';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'Е' || templeLetter == 'е') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][Е][*][*]");
                            letterWord3 = 'Е';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'З' || templeLetter == 'з') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][З][*]");
                            letterWord4 = 'З';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'Д' || templeLetter == 'д') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][*][Д]");
                            letterWord5 = 'Д';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord7 + " ]"
                                        + "[ " + letterWord8 + " ]" + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }

                        }
                        if (letterWord1 == 'П' && letterWord2 == 'О' && letterWord3 == 'Е' && letterWord4 == 'З' && letterWord5 == 'Д') {
                            System.out.println("Поздравляем! Вы угадали слово по буквам!");
                            System.exit(0);
                        }
                    } else {
                        if (computerSelection == 2 && !letterCountCheck == false) {
                            System.out.println("К сожалениею, такой буквы нет в этом слове!");
                            lettersFail++;
                            System.out.println("У вас осталось " + (3 - lettersFail) + " попыток!");
                            if (3 - lettersFail == 0) {
                                System.exit(0);
                            }
                        }
                    }
                    // third
                    if (computerSelection == 3 && ((templeLetter == 'А') || (templeLetter == 'а' || templeLetter == 'В' || templeLetter == 'в'
                            || templeLetter == 'Т' || templeLetter == 'т' || templeLetter == 'О'
                            || templeLetter == 'о' || templeLetter == 'М' || templeLetter == 'м'
                            || templeLetter == 'Б' || templeLetter == 'б' || templeLetter == 'и'
                            || templeLetter == 'И' || templeLetter == 'Л' || templeLetter == 'л' || templeLetter == 'ь' || templeLetter == 'Ь'))) {

                        if (templeLetter == 'А' || templeLetter == 'а') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [А][*][*][*][*][*][*][*][*][*]");
                            letterWord1 = 'А';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }

                        } else if (templeLetter == 'В' || templeLetter == 'в') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][В][*][*][*][*][*][*][*][*]");
                            letterWord2 = 'В';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'Т' || templeLetter == 'т') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][М][*][*][*][*]");
                            letterWord3 = 'Т';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'о' || templeLetter == 'О') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][О][*][О][*][*][*][*]\"");
                            letterWord4 = 'О';
                            letterWord6 = 'О';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'М' || templeLetter == 'м') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][М][*][*][*][*][*][*]\"");
                            letterWord5 = 'М';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'Б' || templeLetter == 'б') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][*][*][*][Б][*][*][*]\"");
                            letterWord7 = 'Б';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'И' || templeLetter == 'и') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][*][*][*][*][И][*][*]\"");
                            letterWord8 = 'И';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        } else if (templeLetter == 'Л' || templeLetter == 'л') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][*][*][*][*][*][Л][*]\"");
                            letterWord9 = 'Л';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        }
                        if (letterWord1 == 'С' && letterWord2 == 'А' && letterWord3 == 'М' && letterWord4 == 'О' && letterWord5 == 'Л' && letterWord6 == 'Ё' && letterWord7 == 'Т') {
                            System.out.println("Поздравляем! Вы угадали слово по буквам!");
                            System.exit(0);
                        } else if (templeLetter == 'Ь' || templeLetter == 'ь') {
                            System.out.println("Правильно, буква " + templeLetter + " есть в этом слове [*][*][*][*][*][*][*][*][*][Ь]\"");
                            letterWord10 = 'Ь';
                            letterCountCheck = true;
                            System.out.println("Ваш прогресс по отгадыванию слова на текущий момент: \n");
                            if (computerSelection == 1) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]");
                            }
                            if (computerSelection == 2) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]");
                            }
                            if (computerSelection == 3) {
                                System.out.println("[ " + letterWord1 + " ]" + "[ " + letterWord2 + " ]" + "[ " + letterWord3 + " ]" + "[ " + letterWord4 + " ]"
                                        + "[ " + letterWord5 + " ]" + "[ " + letterWord6 + " ]" + "[ " + letterWord7 + " ]" + "[ " + letterWord8 + " ]"
                                        + "[ " + letterWord9 + " ]" + "[ " + letterWord10 + " ]");
                            }
                        }
                        if (letterWord1 == 'А' && letterWord2 == 'В' && letterWord3 == 'Т' && letterWord4 == 'О' && letterWord5 == 'М' && letterWord6 == 'О' && letterWord7 == 'Б' && letterWord8 == 'И' && letterWord9 == 'Л' && letterWord10 == 'Ь') {
                            System.out.println("Поздравляем! Вы угадали слово по буквам!");
                            System.exit(0);

                        }

                    }
                            else {
                            if (computerSelection == 3 && !letterCountCheck == false) {
                                System.out.println("К сожалениею, такой буквы нет в этом слове!");
                                lettersFail++;
                                System.out.println("У вас осталось " + (3 - lettersFail) + " попыток!");
                                if (3 - lettersFail == 0) {
                                    System.exit(0);
                                }
                            }

                        }
                    }while (wordFail <= 3) ;
                }



                        case 2 -> {
                            System.out.println("Вы выбрали метод отгадывания слова \"целое слово\"");

                            do {
                                System.out.println("Введите слово: ");
                                String tempWord = scanner.next();

                                if (computerSelection == 1 && tempWord.equalsIgnoreCase(firstWord)) {
                                    System.out.println("Поздравляем! Вы угадали слово!");
                                    System.exit(0);
                                }
                                if (computerSelection == 2 && tempWord.equalsIgnoreCase(secondWord)) {
                                    System.out.println("Поздравляем! Вы угадали слово!");
                                    System.exit(0);
                                }
                                if (computerSelection == 3 && tempWord.equalsIgnoreCase(thirdWord)) {
                                    System.out.println("Поздравляем! Вы угадали слово!");
                                    System.exit(0);
                                } else {
                                    System.out.println("К сожалению, ваш вериант неверный!");
                                    wordFail++;
                                    System.out.println("У вас осталось " + (6 - wordFail) + " попыток!");
                                    if (6 - wordFail == 0) {
                                        System.exit(0);
                                    }
                                }

                            } while (wordFail <= 6);
                        }


                    }
                }
            }




