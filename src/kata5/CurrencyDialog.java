package kata5;

import javax.swing.JComboBox;
import javax.swing.JPanel;

class CurrencyDialog extends JPanel {

    public CurrencyDialog() {
        super();
        add(createComboBox());
    }

    private JComboBox createComboBox() {
        return new JComboBox(new String[] {"EUR", "USD", "GBP"});
    }
    
}
