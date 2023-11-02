package id.ac.unpas.ib.latihan.heuristik.astar;

// main program
public class MainTest {
    // fungsi main
    public static void main(String[] args) {
        // inisialisasi node-node yang ada
        Node bandung = new Node("Bandung");
        Node banyuwangi = new Node("Banyuwangi");
        Node jakarta = new Node("Jakarta");
        Node bondowoso = new Node("Bondowoso");
        Node bogor = new Node("Bogor");
        Node cirebon = new Node("Cirebon");
        Node jember = new Node("Jember");
        Node jogjakarta = new Node("Jogjakarta");
        Node kediri = new Node("Kediri");
        Node madiun = new Node("Madiun");
        Node magelang = new Node("Magelang");
        Node malang = new Node("Malang");
        Node pekalongan = new Node("Pekalongan");
        Node purworejo = new Node("Purworejo");
        Node probolinggo = new Node("Probolinggo");
        Node rembang = new Node("Rembang");
        Node semarang = new Node("Semarang");
        Node serang = new Node("Serang");
        Node sukabumi = new Node("Sukabumi");
        Node surabaya = new Node("Surabaya");

        // inisialisasi node-node yang ada dengan costnya
        NodeUCS bandungUCS = new NodeUCS(bandung, 0);
        NodeUCS banyuwangiUCS = new NodeUCS(banyuwangi, 981);
        NodeUCS jakartaUCS = new NodeUCS(jakarta, 152);
        NodeUCS bondowosoUCS = new NodeUCS(bondowoso, 882);
        NodeUCS bogorUCS = new NodeUCS(bogor, 125);
        NodeUCS cirebonUCS = new NodeUCS(cirebon, 131);
        NodeUCS jemberUCS = new NodeUCS(jember, 887);
        NodeUCS jogjakartaUCS = new NodeUCS(jogjakarta, 484);
        NodeUCS kediriUCS = new NodeUCS(kediri, 633);
        NodeUCS madiunUCS = new NodeUCS(madiun, 581);
        NodeUCS magelangUCS = new NodeUCS(magelang, 403);
        NodeUCS malangUCS = new NodeUCS(malang, 764);
        NodeUCS pekalonganUCS = new NodeUCS(pekalongan, 266);
        NodeUCS purworejoUCS = new NodeUCS(purworejo, 362);
        NodeUCS probolinggoUCS = new NodeUCS(probolinggo, 774);
        NodeUCS rembangUCS = new NodeUCS(rembang, 476);
        NodeUCS semarangUCS = new NodeUCS(semarang, 367);
        NodeUCS serangUCS = new NodeUCS(serang, 258);
        NodeUCS sukabumiUCS = new NodeUCS(sukabumi, 96);
        NodeUCS surabayaUCS = new NodeUCS(surabaya, 675);

        // menambahkan tetangga dari masing-masing node dengan costnya
        bandungUCS.addTetangga(sukabumiUCS, 96);
        bandungUCS.addTetangga(bogorUCS, 125);
        bandungUCS.addTetangga(jakartaUCS, 152);

        jakartaUCS.addTetangga(cirebonUCS, 215);
        jakartaUCS.addTetangga(purworejoUCS, 514);
        jakartaUCS.addTetangga(jemberUCS, 90);
        jakartaUCS.addTetangga(semarangUCS, 85);

        bogorUCS.addTetangga(banyuwangiUCS, 120);
        bogorUCS.addTetangga(probolinggoUCS, 146);
        bogorUCS.addTetangga(purworejoUCS, 138);

        banyuwangiUCS.addTetangga(magelangUCS, 75);
        banyuwangiUCS.addTetangga(bogorUCS, 120);

        bondowosoUCS.addTetangga(jogjakartaUCS, 86);

        cirebonUCS.addTetangga(rembangUCS, 99);
        cirebonUCS.addTetangga(jakartaUCS, 211);

        jemberUCS.addTetangga(jakartaUCS, 90);

        jogjakartaUCS.addTetangga(semarangUCS, 98);
        jogjakartaUCS.addTetangga(bondowosoUCS, 86);

        kediriUCS.addTetangga(malangUCS, 87);
        kediriUCS.addTetangga(serangUCS, 92);

        madiunUCS.addTetangga(rembangUCS, 111);
        madiunUCS.addTetangga(magelangUCS, 70);

        magelangUCS.addTetangga(madiunUCS, 70);
        magelangUCS.addTetangga(banyuwangiUCS, 75);

        malangUCS.addTetangga(kediriUCS, 87);

        pekalonganUCS.addTetangga(sukabumiUCS, 71);
        pekalonganUCS.addTetangga(rembangUCS, 151);

        purworejoUCS.addTetangga(probolinggoUCS, 97);
        purworejoUCS.addTetangga(bogorUCS, 138);
        purworejoUCS.addTetangga(jakartaUCS, 101);

        probolinggoUCS.addTetangga(rembangUCS, 80);
        probolinggoUCS.addTetangga(bogorUCS, 146);
        probolinggoUCS.addTetangga(purworejoUCS, 97);

        rembangUCS.addTetangga(bandungUCS, 140);
        rembangUCS.addTetangga(pekalonganUCS, 151);
        rembangUCS.addTetangga(cirebonUCS, 99);
        rembangUCS.addTetangga(probolinggoUCS, 80);

        rembangUCS.addTetangga(bandungUCS, 118);
        rembangUCS.addTetangga(madiunUCS, 111);

        semarangUCS.addTetangga(jakartaUCS, 85);
        semarangUCS.addTetangga(serangUCS, 142);
        semarangUCS.addTetangga(jogjakartaUCS, 98);
        
        serangUCS.addTetangga(kediriUCS, 92);
        serangUCS.addTetangga(semarangUCS, 142);

        sukabumiUCS.addTetangga(bandungUCS, 75);
        sukabumiUCS.addTetangga(pekalonganUCS, 71);

        // menampilkan hasil dari algoritma A*
        System.out.println("A*");
        // inisialisasi objek AStar
        AStar aStar = new AStar();
        // memanggil fungsi search dari objek aStar dari node bandungUCS ke jakartaUCS
        aStar.search(bandungUCS, sukabumiUCS);
        System.out.println();
    }
}
