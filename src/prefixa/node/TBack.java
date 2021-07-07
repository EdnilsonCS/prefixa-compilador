/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class TBack extends Token
{
    public TBack()
    {
        super.setText("back");
    }

    public TBack(int line, int pos)
    {
        super.setText("back");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBack(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBack(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBack text.");
    }
}
