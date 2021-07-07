/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class TFalseId extends Token
{
    public TFalseId()
    {
        super.setText("false");
    }

    public TFalseId(int line, int pos)
    {
        super.setText("false");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFalseId(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFalseId(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFalseId text.");
    }
}