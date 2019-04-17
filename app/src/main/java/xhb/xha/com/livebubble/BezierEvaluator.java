package xhb.xha.com.livebubble;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/**
 * Created by ysq on 2019/4/17.
 */

public class BezierEvaluator implements TypeEvaluator<PointF> {

    private PointF B,C;
    public BezierEvaluator(PointF B,PointF C){
        this.B = B;
        this.C = C;
    }

    @Override
    public PointF evaluate(float v, PointF A, PointF D) {
        PointF evaluatedPoint = new PointF();
        evaluatedPoint.x = A.x*(1-v)*(1-v)*(1-v) + B.x*3*(1-v)*(1-v)*v + C.x*3*(1-v)*v*v +D.x*v*v*v;
        evaluatedPoint.y = A.y*(1-v)*(1-v)*(1-v) + B.y*3*(1-v)*(1-v)*v + C.y*3*(1-v)*v*v +D.y*v*v*v;
        return evaluatedPoint;
    }
}
