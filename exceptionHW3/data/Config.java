package data;

public class Config {

    public static String start = "exceptionHW3/data/persons/"; // путь к папке для сохранения файлов
    private final String pathCSV;

    Config(String end){
        this.pathCSV = start + end;  // end - это фамилия персоны
    }

    public String getPathCSV() {
        return pathCSV;
    }
}
