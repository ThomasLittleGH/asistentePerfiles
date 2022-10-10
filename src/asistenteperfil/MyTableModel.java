package asistenteperfil;

import static asistenteperfil.Main.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @author telit
 */
public class MyTableModel extends DefaultTableModel {

    public MyTableModel() {
        super(new String[]{"Pregunta", "Habilitado"}, 0);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class clazz = String.class;
        switch (columnIndex) {
            case 0:
                clazz = Integer.class;
                break;
            case 1:
                clazz = Boolean.class;
                break;
        }
        return clazz;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 1;
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        if (aValue instanceof Boolean && column == 1) {
            Vector rowData = (Vector) getDataVector().get(row);
            rowData.set(1, (boolean) aValue);
            fireTableCellUpdated(row, column);
        }
        if ((boolean) aValue == false) {
            String n_pregunta = getDataVector().get(row).toString().replace("[", "").replace(", false]", "");
            for (int i = 0; i < array_preguntas.size(); i++) {
                if (array_preguntas.get(i).split(" ")[0].equals(n_pregunta)) {
                    preguntas_habilitadas.remove(array_preguntas.get(i));
                    respuestas_habilitadas.remove(array_respuestas.get(4 * i));
                    respuestas_habilitadas.remove(array_respuestas.get(4 * i + 1));
                    respuestas_habilitadas.remove(array_respuestas.get(4 * i + 2));
                    respuestas_habilitadas.remove(array_respuestas.get(4 * i + 3));
                    break;
                }
            }
        } else {
            String n_pregunta = getDataVector().get(row).toString().replace("[", "").replace(", true]", "");
            for (int i = 0; i < array_preguntas.size(); i++) {
                if (array_preguntas.get(i).split(" ")[0].equals(n_pregunta)) {
                    preguntas_habilitadas.add(array_preguntas.get(i));
                    respuestas_habilitadas.add(array_respuestas.get(4 * i));
                    respuestas_habilitadas.add(array_respuestas.get(4 * i + 1));
                    respuestas_habilitadas.add(array_respuestas.get(4 * i + 2));
                    respuestas_habilitadas.add(array_respuestas.get(4 * i + 3));
                    break;
                }
            }
        }
    }
}
