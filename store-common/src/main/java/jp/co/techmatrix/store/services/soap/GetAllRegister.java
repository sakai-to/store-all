
package jp.co.techmatrix.store.services.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getAllRegister complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="getAllRegister"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllRegister", propOrder = {
    "arg0"
})
public class GetAllRegister {

    protected int arg0;

    /**
     * arg0�v���p�e�B�̒l���擾���܂��B
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * arg0�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

}
