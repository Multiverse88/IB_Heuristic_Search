package id.ac.unpas.ib.latihan.heuristik.greedybfs;



// Main program
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
        bandungUCS.addTetangga(sukabumiUCS);
        bandungUCS.addTetangga(bogorUCS);
        bandungUCS.addTetangga(jakartaUCS);

        jakartaUCS.addTetangga(cirebonUCS);
        jakartaUCS.addTetangga(purworejoUCS);
        jakartaUCS.addTetangga(jemberUCS);
        jakartaUCS.addTetangga(semarangUCS);

        bogorUCS.addTetangga(banyuwangiUCS);
        bogorUCS.addTetangga(probolinggoUCS);
        bogorUCS.addTetangga(purworejoUCS);

        banyuwangiUCS.addTetangga(magelangUCS);
        banyuwangiUCS.addTetangga(bogorUCS);

        bondowosoUCS.addTetangga(jogjakartaUCS);

        cirebonUCS.addTetangga(rembangUCS);
        cirebonUCS.addTetangga(jakartaUCS);

        jemberUCS.addTetangga(jakartaUCS);

        jogjakartaUCS.addTetangga(semarangUCS);
        jogjakartaUCS.addTetangga(bondowosoUCS);

        kediriUCS.addTetangga(malangUCS);
        kediriUCS.addTetangga(serangUCS);

        madiunUCS.addTetangga(rembangUCS);
        madiunUCS.addTetangga(magelangUCS);

        magelangUCS.addTetangga(madiunUCS);
        magelangUCS.addTetangga(banyuwangiUCS);

        malangUCS.addTetangga(kediriUCS);

        pekalonganUCS.addTetangga(sukabumiUCS);
        pekalonganUCS.addTetangga(rembangUCS);

        purworejoUCS.addTetangga(probolinggoUCS);
        purworejoUCS.addTetangga(bogorUCS);
        purworejoUCS.addTetangga(jakartaUCS);

        probolinggoUCS.addTetangga(rembangUCS);
        probolinggoUCS.addTetangga(bogorUCS);
        probolinggoUCS.addTetangga(purworejoUCS);

        rembangUCS.addTetangga(bandungUCS);
        rembangUCS.addTetangga(pekalonganUCS);
        rembangUCS.addTetangga(cirebonUCS);
        rembangUCS.addTetangga(probolinggoUCS);

        rembangUCS.addTetangga(bandungUCS);
        rembangUCS.addTetangga(madiunUCS);

        semarangUCS.addTetangga(jakartaUCS);
        semarangUCS.addTetangga(serangUCS);
        semarangUCS.addTetangga(jogjakartaUCS);
        
        serangUCS.addTetangga(kediriUCS);
        serangUCS.addTetangga(semarangUCS);

        sukabumiUCS.addTetangga(bandungUCS);
        sukabumiUCS.addTetangga(pekalonganUCS);

        // menampilkan hasil dari algoritma A*
        System.out.println("A*");
        // inisialisasi objek AStar
        GreedyBestFirstSearch bfs = new GreedyBestFirstSearch();
        // memanggil fungsi search dari objek aStar dari node bandungUCS ke jakartaUCS
        bfs.search(bandungUCS, sukabumiUCS);
        System.out.println();
    }
}
