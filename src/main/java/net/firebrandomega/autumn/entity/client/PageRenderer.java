package net.firebrandomega.autumn.entity.client;

import net.firebrandomega.autumn.AutumnMod;
import net.firebrandomega.autumn.entity.PageEntity;
import net.firebrandomega.autumn.entity.RaccoonEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PageRenderer extends GeoEntityRenderer<PageEntity> {
    public PageRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PageModel());
    }

    @Override
    public Identifier getTexture(PageEntity instance){
        return new Identifier(AutumnMod.MOD_ID,"textures/entities/page/page.png");
    }

    @Override
    public Identifier getTextureResource(PageEntity instance){
        return new Identifier(AutumnMod.MOD_ID,"textures/entities/page/page.png");
    }

    @Override
    public RenderLayer getRenderType(PageEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.5f, 0.5f, 0.5f);
        } else {
            stack.scale(1f, 1f, 1f);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder,
                packedLightIn, textureLocation);
    }
}
