/**
 * generated by Xtext
 */
package gama.gaml.compiler.gaml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.gaml.compiler.gaml.TerminalExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see gama.gaml.compiler.gaml.GamlPackage#getTerminalExpression()
 * @model
 * @generated
 */
public interface TerminalExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see gama.gaml.compiler.gaml.GamlPackage#getTerminalExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link gama.gaml.compiler.gaml.TerminalExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // TerminalExpression
