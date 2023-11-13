package Homework1.Fileutil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        fileSearch();
        printSizeOfPackage();
        createFileWithContent();

    }




    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("file search ");
        for (int i = 0; i <2 ; i++) {
            System.out.println("please input file path");
            String path=scanner.nextLine();
            System.out.println("please input file name ");
            String filename=scanner.nextLine();
            File file=new File(path+File.separator+filename);
            System.out.println(file.exists());

        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("print size of package");
        for (int i = 0; i <2 ; i++) {
            System.out.println();

        }
        System.out.println("please input directary");
        String path= scanner.nextLine();
        File[] files =new File(path).listFiles();
        long fileplace=0;
        if (files== null){
            System.out.println("file doesn't exist");
            return;
        }
for (File file:files){
    System.out.println(file.getName()+" "+file.length()+"byte");
    fileplace+=file.length();
}
        System.out.println(fileplace+"byte");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent()throws IOException {
        System.out.println("create file with content");
        for (int i = 0; i <2 ; i++) {
            System.out.println();
        }
        System.out.println("please input directory path");
        String path = scanner.nextLine();
        System.out.println("please input file name");
        String filename = scanner.nextLine();
        System.out.println("please input content");
        String content = scanner.nextLine();
        File file= new File(path+File.separator+filename);
        try {
            if (!file.exists()){
                file.createNewFile();
                System.out.println("file is created");

            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(content);
            bufferedWriter.close();
            System.out.println("file don't created");

        }catch (IOException e){

        }
    }

}


