package proiectlaborator.proiect1.query;

public class Querys {
//    Clienti
    public final static String GET_CLIENTI_SQL = "select * from clienti";
    public final static String ADAUGA_CLIENT = "insert into clienti(idClient, numeClient, prenumeClient, gen, nrTelefon) values (null, ?, ?, ?, ?)";
    public final static String STERGE_CLIENT = "delete from clienti where idClient = ?";
    public final static String UPDATE_TELEFON = "update clienti set nrTelefon = ? where idClient = ?;";

//    Angajati
    public final static String GET_ANGAJATI_SQL = "select * from angajati";
    public final static String ADAUGA_ANGAJAT = "insert into angajati(idAngajat, numeAngajat, prenumeAngajat, taxaPerServiciu) values (null, ?, ?, ?)";
    public final static String STERGE_ANGAJAT = "delete from angajati where idAngajat = ?";

//    Servicii Frizerie
    public final static String GET_SERVICII_SQL = "select * from servicii";
    public final static String ADAUGA_SERVICIU = "insert into servicii(idServiciu, numeServiciu, descriereServiciu, pretServiciu) values (null, ?, ?, ?)";
    public final static String STERGE_SERVICIU = "delete from servicii where idServiciu = ?";


    //    Programari
    public final static String GET_PROGRAMARI_SQL = "select * from programari";
    public final static String ADAUGA_PROGRAMARE = "insert into programari(idProgramare, idClient, idServiciu, idAngajat, data, ora) values (null, ?, ?, ?, ?, ?)";
    public final static String STERGE_PROGRAMARE = "delete from programari where idProgramare = ?";

    //    Plati
    public final static String GET_PLATI_SQL = "select * from plati";
    public final static String ADAUGA_PLATA = "insert into plati(idPlata, idProgramare, metodaDePlata, pretFinal) values (null, ?, ?, " +
            "(select s.pretServiciu from servicii s, programari p where p.idServiciu = s.idServiciu and p.idProgramare = ?)" +
            "+ (select a.taxaPerServiciu from angajati a, programari pr where a.idAngajat = pr.idAngajat and pr.idProgramare = ?)" +
            ")";

}
