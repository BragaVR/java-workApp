package progetti;

public class account {

    private String nome;
    private String cognome;
    private String email;
    private int bilancio;
    private int accountNo;
    private String tel;

    public account() {

    }

    public void putsoldi(int soldi) {
        bilancio = bilancio + soldi;

        System.out.println("il tuo bilancio è : " + bilancio);
    }

    public void prendisoldi(int soldi){
        bilancio=bilancio-soldi;
        System.out.println("il tuo bilancio è : "+bilancio);
    }

    public account(String nome, String cognome, String email, int bilancio, int accountNo, String tel) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.bilancio = bilancio;
        this.accountNo = accountNo;
        this.tel = tel;
    }

    public int getbilancio() {
        return bilancio;
    }

    public void setBalance(int bilancio) {
        this.bilancio = bilancio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}