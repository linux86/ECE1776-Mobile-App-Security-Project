package android.support.v4.c;

public class a {
    public static void a_(Object obj, StringBuilder stringBuilder) {
        if (obj == null) {
            stringBuilder.append("null");
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName == null || simpleName.length() <= 0) {
                simpleName = obj.getClass().getName();
                int lastIndexOf = simpleName.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
            }
            stringBuilder.append(simpleName);
            stringBuilder.append('{');
            stringBuilder.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }
}