package kelompok1_gryffindor;//file termasuk dalam package kelompok1_gryffindor


import java.awt.Graphics;//mengimpor class java.awt.graphics
import java.awt.Graphics2D;//mengimpor class java.awt.graphics2
import java.awt.Image;//mengimpor class java.awt.image
import javax.swing.ImageIcon;//mengimpor class javax.swing.imageicon
import javax.swing.JPanel;//mengimpor class javax.swing.jpanel

public class background extends JPanel{//nama file background, merupakan turunan dari jpanel

    private Image image;//deklarasi variabel image dengan access modifier private

    public background() {//function background
image = new ImageIcon(getClass().getResource("/gambar/buku.jpg")).getImage();//mengambil gambar dengan memasukkan path dari file gambar
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);

        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);//mengatur letak gambar pada file
        gd.dispose();
    }
}
