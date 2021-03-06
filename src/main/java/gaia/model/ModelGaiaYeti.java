package gaia.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaYeti extends ModelBase {
	ModelRenderer head;
	ModelRenderer headaccessory;
	ModelRenderer horns;
	ModelRenderer headjaw;
	ModelRenderer mantle;
	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer rightarm;
	ModelRenderer rightarmlower;
	ModelRenderer rightarmhand;
	ModelRenderer leftarm;
	ModelRenderer leftarmlower;
	ModelRenderer leftarmhand;
	ModelRenderer rightleg;
	ModelRenderer rightleglower;
	ModelRenderer leftleg;
	ModelRenderer leftleglower;

	public ModelGaiaYeti() {
		this.textureWidth = 256;
		this.textureHeight = 128;

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4F, -4F, -9F, 8, 8, 8);
		this.head.setRotationPoint(0F, -7F, -4F);
		this.head.setTextureSize(256, 128);
		this.setRotation(head, 0F, 0F, 0F);
		this.headaccessory = new ModelRenderer(this, 0, 40);
		this.headaccessory.addBox(-6F, -5F, -3F, 12, 8, 6);
		this.headaccessory.setRotationPoint(0F, -7F, -4F);
		this.headaccessory.setTextureSize(256, 128);
		this.setRotation(headaccessory, -0.2617994F, 0F, 0F);
		this.horns = new ModelRenderer(this, 0, 16);
		this.horns.addBox(-4.5F, -6F, -9.5F, 9, 3, 9);
		this.horns.setRotationPoint(0F, -7F, -4F);
		this.horns.setTextureSize(256, 128);
		this.setRotation(horns, 0F, 0F, 0F);
		this.headjaw = new ModelRenderer(this, 0, 28);
		this.headjaw.addBox(-6F, 0F, -3F, 12, 6, 6);
		this.headjaw.setRotationPoint(0F, -7F, -4F);
		this.headjaw.setTextureSize(256, 128);
		this.setRotation(headjaw, 0F, 0F, 0F);
		this.mantle = new ModelRenderer(this, 0, 54);
		this.mantle.addBox(-9F, -4F, -1F, 18, 7, 9);
		this.mantle.setRotationPoint(0F, -9F, -4F);
		this.mantle.setTextureSize(256, 128);
		this.setRotation(mantle, -0.5235988F, 0F, 0F);
		this.body1 = new ModelRenderer(this, 54, 0);
		this.body1.addBox(-8F, -1F, -4.5F, 16, 10, 9);
		this.body1.setRotationPoint(0F, -8F, -4F);
		this.body1.setTextureSize(256, 128);
		this.setRotation(body1, 1.047198F, 0F, 0F);
		this.body2 = new ModelRenderer(this, 54, 19);
		this.body2.addBox(-6.5F, 6F, -2F, 13, 9, 9);
		this.body2.setRotationPoint(0F, -8F, -4F);
		this.body2.setTextureSize(256, 128);
		this.setRotation(body2, 0.5235988F, 0F, 0F);
		this.body3 = new ModelRenderer(this, 54, 37);
		this.body3.addBox(-5.5F, 10F, 5F, 11, 8, 8);
		this.body3.setRotationPoint(0F, -8F, -4F);
		this.body3.setTextureSize(256, 128);
		this.setRotation(body3, 0F, 0F, 0F);
		this.rightarm = new ModelRenderer(this, 122, 0);
		this.rightarm.addBox(-5F, -1F, -3F, 5, 14, 5);
		this.rightarm.setRotationPoint(-6F, -6F, -2F);
		this.rightarm.setTextureSize(256, 128);
		this.setRotation(rightarm, -0.2617994F, 0.1745329F, 0F);
		this.leftarm = new ModelRenderer(this, 122, 0);
		this.leftarm.addBox(0F, -1F, -3F, 5, 14, 5);
		this.leftarm.setRotationPoint(6F, -6F, -2F);
		this.leftarm.setTextureSize(256, 128);
		this.setRotation(leftarm, -0.2617994F, -0.1745329F, 0F);
		this.rightarmlower = new ModelRenderer(this, 122, 19);
		this.rightarmlower.addBox(-6F, 12F, -5.5F, 7, 12, 5);
		this.rightarmlower.setRotationPoint(-6F, -6F, -2F);
		this.rightarmlower.setTextureSize(256, 128);
		this.setRotation(rightarmlower, -0.0872665F, 0.1745329F, 0F);
		this.rightarmhand = new ModelRenderer(this, 122, 36);
		this.rightarmhand.addBox(-5.5F, 8F, 19F, 6, 4, 5);
		this.rightarmhand.setRotationPoint(-6F, -4F, -3F);
		this.rightarmhand.setTextureSize(256, 128);
		this.setRotation(rightarmhand, -1.308997F, 0.1745329F, 0F);
		this.leftarmlower = new ModelRenderer(this, 122, 19);
		this.leftarmlower.addBox(-1F, 12F, -5.5F, 7, 12, 5);
		this.leftarmlower.setRotationPoint(6F, -6F, -2F);
		this.leftarmlower.setTextureSize(256, 128);
		this.setRotation(leftarmlower, -0.0872665F, -0.1745329F, 0F);
		this.leftarmhand = new ModelRenderer(this, 122, 36);
		this.leftarmhand.addBox(-0.5F, 8F, 19F, 6, 4, 5);
		this.leftarmhand.setRotationPoint(6F, -4F, -3F);
		this.leftarmhand.setTextureSize(256, 128);
		this.setRotation(leftarmhand, -1.308997F, -0.1745329F, 0F);
		this.rightleg = new ModelRenderer(this, 104, 0);
		this.rightleg.addBox(-2F, 0F, -2F, 4, 9, 4);
		this.rightleg.setRotationPoint(-4.5F, 6F, 5F);
		this.rightleg.setTextureSize(256, 128);
		this.setRotation(rightleg, -0.2617994F, 0.0872665F, 0F);
		this.rightleglower = new ModelRenderer(this, 104, 13);
		this.rightleglower.addBox(-2.5F, 8F, -5F, 5, 10, 4);
		this.rightleglower.setRotationPoint(-4.5F, 6F, 5F);
		this.rightleglower.setTextureSize(256, 128);
		this.setRotation(rightleglower, 0F, 0.0872665F, 0F);
		this.leftleg = new ModelRenderer(this, 104, 0);
		this.leftleg.addBox(-2F, 0F, -2F, 4, 9, 4);
		this.leftleg.setRotationPoint(4.5F, 6F, 5F);
		this.leftleg.setTextureSize(256, 128);
		this.setRotation(leftleg, -0.2617994F, -0.0872665F, 0F);
		this.leftleglower = new ModelRenderer(this, 104, 13);
		this.leftleglower.addBox(-2.5F, 8F, -5F, 5, 10, 4);
		this.leftleglower.setRotationPoint(4.5F, 6F, 5F);
		this.leftleglower.setTextureSize(256, 128);
		this.setRotation(leftleglower, 0F, -0.0872665F, 0F);
		
		this.convertToChild(head, headaccessory);
		this.convertToChild(head, horns);
		this.convertToChild(head, headjaw);
		this.convertToChild(rightarm, rightarmlower);
		this.convertToChild(rightarm, rightarmhand);
		this.convertToChild(leftarm, leftarmlower);
		this.convertToChild(leftarm, leftarmhand);
	}

	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7);
		this.head.render(par7);
//		this.headaccessory.render(par7);
//		this.horns.render(par7);
//		this.headjaw.render(par7);
		this.mantle.render(par7);
		this.body1.render(par7);
		this.body2.render(par7);
		this.body3.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
//		this.rightarmlower.render(par7);
//		this.rightarmhand.render(par7);
//		this.leftarmlower.render(par7);
//		this.leftarmhand.render(par7);
		this.rightleg.render(par7);
		this.rightleglower.render(par7);
		this.leftleg.render(par7);
		this.leftleglower.render(par7);
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
		this.rightarm.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2 * 0.5F) - 0.2617994F;
		this.leftarm.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 0.8F * par2 * 0.5F) - 0.2617994F;
		
		//legs
		this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
		this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.5F * par2;
		this.rightleglower.rotateAngleX = this.rightleg.rotateAngleX;
		this.leftleglower.rotateAngleX = this.leftleg.rotateAngleX;
		this.rightleg.rotateAngleX -= 0.2617994F;
		this.leftleg.rotateAngleX -= 0.2617994F;
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
