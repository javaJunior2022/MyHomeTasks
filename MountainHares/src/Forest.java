import java.util.List;

public class Forest {
    private static List<MountainHare> hares;

    // объявите недостающие переменные и добавьте конструктор
    private static String season;
    private static String color;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }



    // добавьте метод setSeason(String newSeason)
    static void setSeason(String newSeason){
        season=newSeason;
        if (newSeason.equals ("зима")){
            MountainHare.color="белый";
        }else{
            MountainHare.color="серо-рыжий";
        }

    }


    // добавьте метод printHares()
    static void printHares(List<MountainHare> hares){
        for (MountainHare hare : Forest.hares){
           System.out.println(hare);
        }
    }


}