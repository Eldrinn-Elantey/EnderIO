package info.loenwind.autosave.exceptions;

import java.lang.reflect.Field;

public class NoHandlerFoundException extends Exception {

  public NoHandlerFoundException(Field field, Object o) {
    super("No storage handler found for field " + field.getName() + " of type " + field.getType() + " of " + o);
  }

  public NoHandlerFoundException(Class<?> clazz, String name) {
    super("No storage handler found for field " + name + " of type " + clazz);
  }

}
