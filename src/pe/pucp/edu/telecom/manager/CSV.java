package pe.pucp.edu.telecom.manager;
import pe.pucp.edu.telecom.entity.base.Usuario;

import java.io.Writer;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class CSV {
        CSVUtils csvUtils =  new CSVUtils();
        private static final char DEFAULT_SEPARATOR = ',';
        ArrayList<Usuario> listaEncontrados = new ArrayList<>();

        String csvFile = "busqueda.csv";
        FileWriter writer = new FileWriter(csvFile);


        //for header

        csvUtils.writeLine(writer, Arrays.asList("Name", "Salary", "Age"));

        for (Usuario d : listaEncontrados) {

            List<String> list = new ArrayList<>();
            list.add(d.getName());
            list.add(d.getSalary().toString());
            list.add(String.valueOf(d.getAge()));

            CSVUtils.writeLine(writer, list);

            //try custom separator and quote.
            //CSVUtils.writeLine(writer, list, '|', '\"');
        }

    public CSV() throws IOException {
    }

        writer.flush();
        writer.close();


}
