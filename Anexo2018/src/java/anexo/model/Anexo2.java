package anexo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "anexo2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anexo2.findAll", query = "SELECT a FROM Anexo2 a")
    , @NamedQuery(name = "Anexo2.findById", query = "SELECT a FROM Anexo2 a WHERE a.id = :id")
    , @NamedQuery(name = "Anexo2.findByCodUnieje", query = "SELECT a FROM Anexo2 a WHERE a.codUnieje = :codUnieje")
    , @NamedQuery(name = "Anexo2.findByDesUnieje", query = "SELECT a FROM Anexo2 a WHERE a.desUnieje = :desUnieje")
    , @NamedQuery(name = "Anexo2.findByCodGasto", query = "SELECT a FROM Anexo2 a WHERE a.codGasto = :codGasto")
    , @NamedQuery(name = "Anexo2.findByDesGasto", query = "SELECT a FROM Anexo2 a WHERE a.desGasto = :desGasto")
    , @NamedQuery(name = "Anexo2.findByCodDepen", query = "SELECT a FROM Anexo2 a WHERE a.codDepen = :codDepen")
    , @NamedQuery(name = "Anexo2.findByNomDepen", query = "SELECT a FROM Anexo2 a WHERE a.nomDepen = :nomDepen")
    , @NamedQuery(name = "Anexo2.findByCodPuesto", query = "SELECT a FROM Anexo2 a WHERE a.codPuesto = :codPuesto")
    , @NamedQuery(name = "Anexo2.findByIndTiprel", query = "SELECT a FROM Anexo2 a WHERE a.indTiprel = :indTiprel")
    , @NamedQuery(name = "Anexo2.findByCodCargo", query = "SELECT a FROM Anexo2 a WHERE a.codCargo = :codCargo")
    , @NamedQuery(name = "Anexo2.findByDesCargo", query = "SELECT a FROM Anexo2 a WHERE a.desCargo = :desCargo")
    , @NamedQuery(name = "Anexo2.findByCodTipcar", query = "SELECT a FROM Anexo2 a WHERE a.codTipcar = :codTipcar")
    , @NamedQuery(name = "Anexo2.findByDesTipcar", query = "SELECT a FROM Anexo2 a WHERE a.desTipcar = :desTipcar")
    , @NamedQuery(name = "Anexo2.findByCodCatego", query = "SELECT a FROM Anexo2 a WHERE a.codCatego = :codCatego")
    , @NamedQuery(name = "Anexo2.findByMonCatego", query = "SELECT a FROM Anexo2 a WHERE a.monCatego = :monCatego")
    , @NamedQuery(name = "Anexo2.findByCodPerson", query = "SELECT a FROM Anexo2 a WHERE a.codPerson = :codPerson")
    , @NamedQuery(name = "Anexo2.findByNomPerson", query = "SELECT a FROM Anexo2 a WHERE a.nomPerson = :nomPerson")
    , @NamedQuery(name = "Anexo2.findByApePerson", query = "SELECT a FROM Anexo2 a WHERE a.apePerson = :apePerson")})
public class Anexo2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_unieje")
    private int codUnieje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "des_unieje")
    private String desUnieje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_gasto")
    private int codGasto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "des_gasto")
    private String desGasto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_depen")
    private int codDepen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nom_depen")
    private String nomDepen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_puesto")
    private int codPuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "ind_tiprel")
    private String indTiprel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_cargo")
    private int codCargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "des_cargo")
    private String desCargo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tipcar")
    private int codTipcar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "des_tipcar")
    private String desTipcar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "cod_catego")
    private String codCatego;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mon_catego")
    private int monCatego;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "cod_person")
    private String codPerson;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nom_person")
    private String nomPerson;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ape_person")
    private String apePerson;

    public Anexo2() {
    }

    public Anexo2(Long id) {
        this.id = id;
    }

    public Anexo2(Long id, int codUnieje, String desUnieje, int codGasto, String desGasto, int codDepen, String nomDepen, int codPuesto, String indTiprel, int codCargo, String desCargo, int codTipcar, String desTipcar, String codCatego, int monCatego, String codPerson, String nomPerson, String apePerson) {
        this.id = id;
        this.codUnieje = codUnieje;
        this.desUnieje = desUnieje;
        this.codGasto = codGasto;
        this.desGasto = desGasto;
        this.codDepen = codDepen;
        this.nomDepen = nomDepen;
        this.codPuesto = codPuesto;
        this.indTiprel = indTiprel;
        this.codCargo = codCargo;
        this.desCargo = desCargo;
        this.codTipcar = codTipcar;
        this.desTipcar = desTipcar;
        this.codCatego = codCatego;
        this.monCatego = monCatego;
        this.codPerson = codPerson;
        this.nomPerson = nomPerson;
        this.apePerson = apePerson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodUnieje() {
        return codUnieje;
    }

    public void setCodUnieje(int codUnieje) {
        this.codUnieje = codUnieje;
    }

    public String getDesUnieje() {
        return desUnieje;
    }

    public void setDesUnieje(String desUnieje) {
        this.desUnieje = desUnieje;
    }

    public int getCodGasto() {
        return codGasto;
    }

    public void setCodGasto(int codGasto) {
        this.codGasto = codGasto;
    }

    public String getDesGasto() {
        return desGasto;
    }

    public void setDesGasto(String desGasto) {
        this.desGasto = desGasto;
    }

    public int getCodDepen() {
        return codDepen;
    }

    public void setCodDepen(int codDepen) {
        this.codDepen = codDepen;
    }

    public String getNomDepen() {
        return nomDepen;
    }

    public void setNomDepen(String nomDepen) {
        this.nomDepen = nomDepen;
    }

    public int getCodPuesto() {
        return codPuesto;
    }

    public void setCodPuesto(int codPuesto) {
        this.codPuesto = codPuesto;
    }

    public String getIndTiprel() {
        return indTiprel;
    }

    public void setIndTiprel(String indTiprel) {
        this.indTiprel = indTiprel;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public String getDesCargo() {
        return desCargo;
    }

    public void setDesCargo(String desCargo) {
        this.desCargo = desCargo;
    }

    public int getCodTipcar() {
        return codTipcar;
    }

    public void setCodTipcar(int codTipcar) {
        this.codTipcar = codTipcar;
    }

    public String getDesTipcar() {
        return desTipcar;
    }

    public void setDesTipcar(String desTipcar) {
        this.desTipcar = desTipcar;
    }

    public String getCodCatego() {
        return codCatego;
    }

    public void setCodCatego(String codCatego) {
        this.codCatego = codCatego;
    }

    public int getMonCatego() {
        return monCatego;
    }

    public void setMonCatego(int monCatego) {
        this.monCatego = monCatego;
    }

    public String getCodPerson() {
        return codPerson;
    }

    public void setCodPerson(String codPerson) {
        this.codPerson = codPerson;
    }

    public String getNomPerson() {
        return nomPerson;
    }

    public void setNomPerson(String nomPerson) {
        this.nomPerson = nomPerson;
    }

    public String getApePerson() {
        return apePerson;
    }

    public void setApePerson(String apePerson) {
        this.apePerson = apePerson;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anexo2)) {
            return false;
        }
        Anexo2 other = (Anexo2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anexo.model.Anexo2[ id=" + id + " ]";
    }
    
}
