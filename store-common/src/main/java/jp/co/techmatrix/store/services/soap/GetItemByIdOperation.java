
package jp.co.techmatrix.store.services.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getItemByIdOperation complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="getItemByIdOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemByIdOperation", propOrder = {
    "id"
})
public class GetItemByIdOperation {

    protected int id;

    /**
     * id�v���p�e�B�̒l���擾���܂��B
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * id�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
