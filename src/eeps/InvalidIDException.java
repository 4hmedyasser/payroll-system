package eeps;

public class InvalidIDException extends Exception {
    private int MessageType = new Integer(0);
    public InvalidIDException(int Type){
            MessageType = Type;
        }

    public void showMessage() {
        
        switch (MessageType) {
                case 1:
                    new InvalidEngineerID().setVisible(true);
                    break;
                case 2:
                    new InvalidTraineeID().setVisible(true);
                    break;
        }
        
    }
    
}
