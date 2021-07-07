/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import java.util.*;
import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ADeclParametros extends PDeclParametros
{
    private PTipo _tipo_;
    private TIdentifier _identifier_;
    private final LinkedList<PDeclParamAdicional> _declParamAdicional_ = new LinkedList<PDeclParamAdicional>();

    public ADeclParametros()
    {
        // Constructor
    }

    public ADeclParametros(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PDeclParamAdicional> _declParamAdicional_)
    {
        // Constructor
        setTipo(_tipo_);

        setIdentifier(_identifier_);

        setDeclParamAdicional(_declParamAdicional_);

    }

    @Override
    public Object clone()
    {
        return new ADeclParametros(
            cloneNode(this._tipo_),
            cloneNode(this._identifier_),
            cloneList(this._declParamAdicional_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclParametros(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PDeclParamAdicional> getDeclParamAdicional()
    {
        return this._declParamAdicional_;
    }

    public void setDeclParamAdicional(List<PDeclParamAdicional> list)
    {
        this._declParamAdicional_.clear();
        this._declParamAdicional_.addAll(list);
        for(PDeclParamAdicional e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._identifier_)
            + toString(this._declParamAdicional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._declParamAdicional_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PDeclParamAdicional> i = this._declParamAdicional_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclParamAdicional) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
