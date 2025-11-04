/*
class Atividade13{
    abstract class Funcionario{
        private String Nome;
        private String Matricula;

        public String getNome(){
            return this.Nome;
        }
        public void setNome(String nome){
            this.Nome = nome;
        }
        public String getMatricula(){
            return this.Matricula;
        }
        public void setMatricula(String matricula){
            this.Nome = matricula;
        }

        public abstract double calcularSalario();
    }

    class funcionarioCLT extends Funcionario{
        private double Salario;
        private double Descontos;

        public double getSalario(){
            return this.Salario;
        }

        public void setSalario(double salario){
            this.Salario = salario;
        }
        public double getDescontos(){
            return this.Descontos;
        }

        public void setDescontos(double descontos){
            this.Descontos = descontos;
        }

        @Override
        public double calcularSalario(){
            return this.Salario - this.Descontos;
        }
    }

    class funcionarioPJ extends Funcionario{
        private int Horas;
        private double VlrHoras;

        public double getHoras(){
            return this.Horas;
        }

        public void setHoras(int horas){
            this.Horas = horas;
        }
        public double getVlrhoras(){
            return this.VlrHoras;
        }

        public void setVlrHoras(double hrs){
            this.VlrHoras = hrs;
        }

        @Override
        public double calcularSalario(){
            return this.Horas * this.VlrHoras;
        }
    }

    abstract class Veiculo{
        private String Modelo;
        private String Marca;
        private String Ano;

        public String getModelo(){
            return this.Modelo;
        }

        public void setModelo(String modelo){
            this.Modelo = modelo;
        }

        public String getMarca(){
            return this.Marca;
        }

        public void setMarca(String marca){
            this.Marca = marca;
        }
        
        public String getAno(){
            return this.Ano;
        }

        public void setAno(String ano){
            this.Ano = ano;
        }

        public abstract double calcularImposto(double IPVA, double aliquota);

        public void exibirDetalhes(){
            System.out.println("Aqui estão os detalhes de veiculo:");
            System.out.println("Modelo:" + this.Modelo + "Marca" + this.Marca + "Ano:" + this.Ano);
        }
    }

    class Carro extends Veiculo{

        @Override
        public double calcularImposto(double IPVA, double aliquota){
            return IPVA + aliquota;
        }
    }

    class Moto extends  Veiculo{
        private double CRLV;

        
        public double getCRLV(){
            return this.CRLV;
        }

        public void setCRLV(double clrv){
            this.CRLV = clrv;
        }

        @Override
        public double calcularImposto(double IPVA, double aliquota){
            return IPVA + aliquota + this.CRLV;
        }
    }

    class caminha extends Veiculo{
        private double VlrVenal;


        public double getVlrVenal(){
            return this.VlrVenal;
        }

        public void setVlrVenal(double vlr){
            this.VlrVenal = vlr;
        }
        @Override
        public double calcularImposto(double IPVA, double aliquota){
            return IPVA + aliquota + this.VlrVenal;
        }
    }
}
*/



