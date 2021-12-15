package CODE;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Staff extends AbstractTableModel{

    private final String[] entetes = {"Name", "Weight", "Salary", "Fonction", "Type"};
    private final List<Employee> tabStaff = new ArrayList<Employee>();

    public Staff() {
        super();

        tabStaff.add(new Employee("Johnathan", 55, 65 , true, 2));
        tabStaff.add(new Employee("Nicolas", 55, 65, false, 0));
        tabStaff.add(new Employee("Damien", 55, 65, true, 1));
        tabStaff.add(new Employee("Corinne", 55, 65, false, 0));
        tabStaff.add(new Employee("Emilie", 55, 65, false, 0));
        tabStaff.add(new Employee("Delphine", 55, 65, false, 0));
        tabStaff.add(new Employee("Eric", 55, 65, true, 3));

    }

    public int getRowCount() {
        return tabStaff.size();
    }
    public int getColumnCount() {
        return entetes.length;
    }
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return tabStaff.get(rowIndex).getEmployee_name();
            case 1:
                return tabStaff.get(rowIndex).getWeight();
            case 2:
                return tabStaff.get(rowIndex).getSalary();
            case 3:
                return tabStaff.get(rowIndex).isACylist();
            default:
                return null; //Ne devrait jamais arriver
        }
    }

    public void addEmployee(Employee E) {
        tabStaff.add(E);
        fireTableRowsInserted(tabStaff.size() -1, tabStaff.size() -1);
    }
    public void removeEmployee(int rowIndex) {
        tabStaff.remove(rowIndex);
    }


}
