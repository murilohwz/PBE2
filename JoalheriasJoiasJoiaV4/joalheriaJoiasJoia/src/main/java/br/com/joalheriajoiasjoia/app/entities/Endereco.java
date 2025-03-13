package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente_endereco")
public class Endereco {
    
        // Atributos
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idEndereco", nullable = false)
        private Long idEndereco;
        
        @Column(name = "Cep", nullable = false)
        private String cep;
        
        @Column(name = "Rua", nullable = false, length = 100)
        private String rua;
        
        @Column(name = "Numero", nullable = false, length = 11, unique = true)
        private String numero;
        
        @Column(name = "Cidade", nullable = false, unique = true, length = 50)
        private String cidade;
        
        @Column(name = "Estado", nullable = false,  unique = false)
        private String estado;
        
        @Column(name = "Complemento", nullable = false,  unique = false)
        private String complemnto;
        
        @Column(name = "Bairro", nullable = false,  unique = false)
        private String bairro;



        // Construtores
        public Endereco() {

        }



		public Long getIdEndereco() {
			// TODO Auto-generated method stub
			return null;
		}

}

