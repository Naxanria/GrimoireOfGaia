package gaia.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaMinotaur extends ModelBase {
	ModelRenderer head;
	ModelRenderer horn;
	ModelRenderer hornright;
	ModelRenderer hornleft;
	ModelRenderer brow;
	ModelRenderer nose;
    ModelRenderer nosering;
	ModelRenderer neckmuscle;
	ModelRenderer body;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer waist;
	ModelRenderer rightarm;
	public static ModelRenderer rightarmlower;
	ModelRenderer righthandle;
	ModelRenderer righthammerhead;
	ModelRenderer leftarm;
	ModelRenderer leftarmlower;
	ModelRenderer rightleg;
	ModelRenderer rightleglower;
	ModelRenderer rightfoot;
	ModelRenderer leftleg;
	ModelRenderer leftleglower;
	ModelRenderer leftfoot;

	public ModelGaiaMinotaur() {
		this.textureWidth = 128;
		this.textureHeight = 64;

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3.5F, -7F, -4F, 7, 7, 8);
		this.head.setRotationPoint(0F, -9F, -4F);
		this.head.setTextureSize(128, 64);
		this.setRotation(head, 0F, 0F, 0F);
		this.horn = new ModelRenderer(this, 50, 0);
		this.horn.addBox(-7.5F, -6F, -3F, 15, 2, 2);
		this.horn.setRotationPoint(0F, -9F, -4F);
		this.horn.setTextureSize(128, 64);
		this.setRotation(horn, 0F, 0F, 0F);
		this.hornright = new ModelRenderer(this, 76, 4);
		this.hornright.addBox(-7.5F, -10F, 1F, 2, 5, 2);
		this.hornright.setRotationPoint(0F, -9F, -4F);
		this.hornright.setTextureSize(128, 64);
		this.setRotation(hornright, 0.7853982F, 0F, 0F);
		this.hornleft = new ModelRenderer(this, 76, 4);
		this.hornleft.addBox(5.5F, -10F, 1F, 2, 5, 2);
		this.hornleft.setRotationPoint(0F, -9F, -4F);
		this.hornleft.setTextureSize(128, 64);
		this.setRotation(hornleft, 0.8028515F, 0F, 0F);
		this.brow = new ModelRenderer(this, 30, 0);
		this.brow.addBox(-3F, -6F, -6F, 6, 2, 2);
		this.brow.setRotationPoint(0F, -9F, -4F);
		this.brow.setTextureSize(128, 64);
		this.setRotation(brow, 0F, 0F, 0F);
		this.nose = new ModelRenderer(this, 30, 4);
		this.nose.addBox(-2.5F, -4F, -9F, 5, 4, 5);
		this.nose.setRotationPoint(0F, -9F, -4F);
		this.nose.setTextureSize(128, 64);
		this.setRotation(nose, 0F, 0F, 0F);
		this.nosering = new ModelRenderer(this, 30, 13);
		this.nosering.addBox(-2F, -1F, -10F, 4, 4, 1);
		this.nosering.setRotationPoint(0F, -9F, -4F);
		this.nosering.setTextureSize(128, 64);
		this.setRotation(nosering, 0F, 0F, 0F);
		this.neckmuscle = new ModelRenderer(this, 0, 15);
		this.neckmuscle.addBox(-5F, -2F, 1.5F, 10, 6, 5);
		this.neckmuscle.setRotationPoint(0F, -9F, -4F);
		this.neckmuscle.setTextureSize(128, 64);
		this.setRotation(neckmuscle, 0.6108652F, 0F, 0F);
		this.body = new ModelRenderer(this, 0, 26);
		this.body.addBox(-6F, 0F, -4F, 12, 9, 8);
		this.body.setRotationPoint(0F, -10F, 0F);
		this.body.setTextureSize(128, 64);
		this.setRotation(body, 0.1745329F, 0F, 0F);
		this.body2 = new ModelRenderer(this, 0, 43);
		this.body2.addBox(-5F, 11F, -2F, 10, 5, 6);
		this.body2.setRotationPoint(0F, -12F, 0F);
		this.body2.setTextureSize(128, 64);
		this.setRotation(body2, 0.0872665F, 0F, 0F);
		this.body3 = new ModelRenderer(this, 0, 54);
		this.body3.addBox(-4F, 16F, -1F, 8, 5, 5);
		this.body3.setRotationPoint(0F, -12F, 0F);
		this.body3.setTextureSize(128, 64);
		this.setRotation(body3, 0F, 0F, 0F);
		this.waist = new ModelRenderer(this, 72, 15);
		this.waist.addBox(-4.5F, 16F, -1.5F, 9, 8, 6);
		this.waist.setRotationPoint(0F, -12F, 0F);
		this.waist.setTextureSize(128, 64);
		this.setRotation(waist, 0F, 0F, 0F);
		this.rightarm = new ModelRenderer(this, 40, 17);
		this.rightarm.addBox(-3F, -2F, -2F, 4, 10, 4);
		this.rightarm.setRotationPoint(-7F, -7F, 0F);
		this.rightarm.setTextureSize(128, 64);
		this.setRotation(rightarm, 0F, 0F, 0.1745329F);
		this.leftarm = new ModelRenderer(this, 56, 17);
		this.leftarm.addBox(-1F, -2F, -2F, 4, 10, 4);
		this.leftarm.setRotationPoint(7F, -7F, 0F);
		this.leftarm.setTextureSize(128, 64);
		this.setRotation(leftarm, 0F, 0F, -0.1745329F);
		this.rightarmlower = new ModelRenderer(this, 40, 31);
		this.rightarmlower.addBox(-4.5F, 8F, -2F, 4, 8, 4);
		this.rightarmlower.setRotationPoint(-7F, -7F, 0F);
		this.rightarmlower.setTextureSize(128, 64);
		this.setRotation(rightarmlower, 0F, 0F, 0F);
		this.righthandle = new ModelRenderer(this, 120, 16);
		this.righthandle.addBox(-3.5F, -9F, -15F, 2, 18, 2);
		this.righthandle.setRotationPoint(-7F, -7F, 0F);
		this.righthandle.setTextureSize(128, 64);
		this.setRotation(righthandle, 1.570796F, 0F, 0F);
		this.righthammerhead = new ModelRenderer(this, 96, 0);
		this.righthammerhead.addBox(-5.5F, -15F, -19F, 6, 6, 10);
		this.righthammerhead.setRotationPoint(-7F, -7F, 0F);
		this.righthammerhead.setTextureSize(128, 64);
		this.setRotation(righthammerhead, 1.570796F, 0F, 0F);
		this.leftarmlower = new ModelRenderer(this, 56, 31);
		this.leftarmlower.addBox(0.5F, 8F, -2F, 4, 8, 4);
		this.leftarmlower.setRotationPoint(7F, -7F, 0F);
		this.leftarmlower.setTextureSize(128, 64);
		this.setRotation(leftarmlower, 0F, 0F, 0F);
		this.rightleg = new ModelRenderer(this, 72, 29);
		this.rightleg.addBox(-2F, -1F, -2F, 4, 9, 4);
		this.rightleg.setRotationPoint(-4F, 7F, 2F);
		this.rightleg.setTextureSize(128, 64);
		this.setRotation(rightleg, -0.4363323F, 0F, 0F);
		this.rightleglower = new ModelRenderer(this, 72, 42);
		this.rightleglower.addBox(-1.5F, 5F, 2F, 3, 10, 3);
		this.rightleglower.setRotationPoint(-4F, 7F, 2F);
		this.rightleglower.setTextureSize(128, 64);
		this.setRotation(rightleglower, -0.4363323F, 0F, 0F);
		this.rightfoot = new ModelRenderer(this, 72, 55);
		this.rightfoot.addBox(-2F, 14F, -5F, 4, 3, 4);
		this.rightfoot.setRotationPoint(-4F, 7F, 2F);
		this.rightfoot.setTextureSize(128, 64);
		this.setRotation(rightfoot, 0F, 0F, 0F);
		this.leftleg = new ModelRenderer(this, 88, 29);
		this.leftleg.addBox(-2F, -1F, -2F, 4, 9, 4);
		this.leftleg.setRotationPoint(4F, 7F, 2F);
		this.leftleg.setTextureSize(128, 64);
		this.setRotation(leftleg, -0.3490659F, 0F, 0F);
		this.leftleglower = new ModelRenderer(this, 72, 42);
		this.leftleglower.addBox(-1.5F, 5F, 2F, 3, 10, 3);
		this.leftleglower.setRotationPoint(4F, 7F, 2F);
		this.leftleglower.setTextureSize(128, 64);
		this.setRotation(leftleglower, -0.4363323F, 0F, 0F);
		this.leftfoot = new ModelRenderer(this, 72, 55);
		this.leftfoot.addBox(-2F, 14F, -5F, 4, 3, 4);
		this.leftfoot.setRotationPoint(4F, 7F, 2F);
		this.leftfoot.setTextureSize(128, 64);
		this.setRotation(leftfoot, 0F, 0F, 0F);
		
		this.convertToChild(head, horn);
		this.convertToChild(head, hornright);
		this.convertToChild(head, hornleft);
		this.convertToChild(head, brow);
		this.convertToChild(head, nose);
		this.convertToChild(head, nosering);
		this.convertToChild(rightarm, rightarmlower);
		this.convertToChild(rightarm, righthandle);
		this.convertToChild(rightarm, righthammerhead);
		this.convertToChild(leftarm, leftarmlower);
	}

	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7);
		this.head.render(par7);
//		this.horn.render(par7);
//		this.hornright.render(par7);
//		this.hornleft.render(par7);
//		this.brow.render(par7);
//		this.nose.render(par7);
//		this.nosering.render(par7);
		this.neckmuscle.render(par7);
		this.body.render(par7);
		this.body2.render(par7);
		this.body3.render(par7);
		this.waist.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
//		this.rightarmlower.render(par7);
//		this.righthandle.render(par7);
//		this.righthammerhead.render(par7);
//		this.leftarmlower.render(par7);
		this.rightleg.render(par7);
		this.rightleglower.render(par7);
		this.rightfoot.render(par7);
		this.leftleg.render(par7);
		this.leftleglower.render(par7);
		this.leftfoot.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
		//head
		this.head.rotateAngleY = par4 / 57.295776F;
		this.head.rotateAngleX = par5 / 57.295776F;
		
		//arms
		this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2 * 0.5F;
		this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2 * 0.5F;
		
		this.rightarm.rotateAngleZ = 0.0F;
		this.leftarm.rotateAngleZ = 0.0F;
		
        float f6;
        float f7;

        if (this.swingProgress > -9990.0F) {
            f6 = this.swingProgress;
            f6 = 1.0F - this.swingProgress;
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0F - f6;
            f7 = MathHelper.sin(f6 * (float)Math.PI);
            float f8 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            
            this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
            this.rightarm.rotateAngleX += (this.body.rotateAngleY * 2.0F);
            this.rightarm.rotateAngleZ = (MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F);
        }
        
        this.rightarm.rotateAngleZ += (MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F) + 0.1745329F;
        this.rightarm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        this.leftarm.rotateAngleZ -= (MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F) + 0.1745329F;
        this.leftarm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
		
		//legs
		this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2;
		this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2;
		this.rightleglower.rotateAngleX = this.rightleg.rotateAngleX - 0.4363323F;
		this.leftleglower.rotateAngleX = this.leftleg.rotateAngleX - 0.4363323F;
		this.rightfoot.rotateAngleX = this.rightleg.rotateAngleX;
		this.leftfoot.rotateAngleX = this.leftleg.rotateAngleX;
		this.rightleg.rotateAngleX -= 0.4363323F;
		this.leftleg.rotateAngleX -= 0.4363323F;
	}
	
	protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild) {
		parChild.rotationPointX -= parParent.rotationPointX;
		parChild.rotationPointY -= parParent.rotationPointY;
		parChild.rotationPointZ -= parParent.rotationPointZ;
		parChild.rotateAngleX -= parParent.rotateAngleX;
		parChild.rotateAngleY -= parParent.rotateAngleY;
		parChild.rotateAngleZ -= parParent.rotateAngleZ;
		parParent.addChild(parChild);
	}
}
