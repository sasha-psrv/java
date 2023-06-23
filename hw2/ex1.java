package hw2;

public class ex1 {
    
    /*
     * Дана строка sql-запроса "select * from students WHERE ".
     * Сформируйте часть WHERE этого запроса, используя StringBuilder.
     * Данные для фильтрации приведены ниже в виде json-строки.
     * Если значение null, то параметр не должен попадать в запрос.
     * String input_str =
     * "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
     * Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow",
     * "age":"null"}
     * вывод: select * from students WHERE name=Ivanov AND country=Russia AND
     * city=Moscow
     */

   public static void split() {
        String input_str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        String[] filters = input_str.replace("{","").replace("}","").split(", ");
        StringBuilder query = new StringBuilder();
        for (String filter : filters) {
            String[] keyValue = filter.split(":");
            String key = keyValue[0].replace("'","");
            String value = keyValue[1].replace("'","");
            if (!value.equals("null")) {
                query.append(key).append("=").append(value).append(" AND ");
            }
        }       
        if(query.isEmpty()){
            System.out.println("select * from students");
        } else {
        query.delete(query.length()-5, query.length());
        String sqlQuery = "select * from students WHERE " + query.toString();
        System.out.println(sqlQuery);
        }
    }
    public static void main(String[] args) {
        split();
    }
    
}