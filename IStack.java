/**
 * IStack - Interface that instantiates methods
 * @author Taylor Brookes
 * @version 27 September 2023
*/
public interface IStack {
  void push (String c);
  String pop();
  String peek();
  boolean isEmpty();
}
