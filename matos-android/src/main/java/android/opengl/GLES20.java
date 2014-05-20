package android.opengl;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


public class GLES20
{
  // Fields

  public static final int GL_ACTIVE_TEXTURE = 34016;

  public static final int GL_DEPTH_BUFFER_BIT = 256;

  public static final int GL_STENCIL_BUFFER_BIT = 1024;

  public static final int GL_COLOR_BUFFER_BIT = 16384;

  public static final int GL_FALSE = 0;

  public static final int GL_TRUE = 1;

  public static final int GL_POINTS = 0;

  public static final int GL_LINES = 1;

  public static final int GL_LINE_LOOP = 2;

  public static final int GL_LINE_STRIP = 3;

  public static final int GL_TRIANGLES = 4;

  public static final int GL_TRIANGLE_STRIP = 5;

  public static final int GL_TRIANGLE_FAN = 6;

  public static final int GL_ZERO = 0;

  public static final int GL_ONE = 1;

  public static final int GL_SRC_COLOR = 768;

  public static final int GL_ONE_MINUS_SRC_COLOR = 769;

  public static final int GL_SRC_ALPHA = 770;

  public static final int GL_ONE_MINUS_SRC_ALPHA = 771;

  public static final int GL_DST_ALPHA = 772;

  public static final int GL_ONE_MINUS_DST_ALPHA = 773;

  public static final int GL_DST_COLOR = 774;

  public static final int GL_ONE_MINUS_DST_COLOR = 775;

  public static final int GL_SRC_ALPHA_SATURATE = 776;

  public static final int GL_FUNC_ADD = 32774;

  public static final int GL_BLEND_EQUATION = 32777;

  public static final int GL_BLEND_EQUATION_RGB = 32777;

  public static final int GL_BLEND_EQUATION_ALPHA = 34877;

  public static final int GL_FUNC_SUBTRACT = 32778;

  public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;

  public static final int GL_BLEND_DST_RGB = 32968;

  public static final int GL_BLEND_SRC_RGB = 32969;

  public static final int GL_BLEND_DST_ALPHA = 32970;

  public static final int GL_BLEND_SRC_ALPHA = 32971;

  public static final int GL_CONSTANT_COLOR = 32769;

  public static final int GL_ONE_MINUS_CONSTANT_COLOR = 32770;

  public static final int GL_CONSTANT_ALPHA = 32771;

  public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;

  public static final int GL_BLEND_COLOR = 32773;

  public static final int GL_ARRAY_BUFFER = 34962;

  public static final int GL_ELEMENT_ARRAY_BUFFER = 34963;

  public static final int GL_ARRAY_BUFFER_BINDING = 34964;

  public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;

  public static final int GL_STREAM_DRAW = 35040;

  public static final int GL_STATIC_DRAW = 35044;

  public static final int GL_DYNAMIC_DRAW = 35048;

  public static final int GL_BUFFER_SIZE = 34660;

  public static final int GL_BUFFER_USAGE = 34661;

  public static final int GL_CURRENT_VERTEX_ATTRIB = 34342;

  public static final int GL_FRONT = 1028;

  public static final int GL_BACK = 1029;

  public static final int GL_FRONT_AND_BACK = 1032;

  public static final int GL_TEXTURE_2D = 3553;

  public static final int GL_CULL_FACE = 2884;

  public static final int GL_BLEND = 3042;

  public static final int GL_DITHER = 3024;

  public static final int GL_STENCIL_TEST = 2960;

  public static final int GL_DEPTH_TEST = 2929;

  public static final int GL_SCISSOR_TEST = 3089;

  public static final int GL_POLYGON_OFFSET_FILL = 32823;

  public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 32926;

  public static final int GL_SAMPLE_COVERAGE = 32928;

  public static final int GL_NO_ERROR = 0;

  public static final int GL_INVALID_ENUM = 1280;

  public static final int GL_INVALID_VALUE = 1281;

  public static final int GL_INVALID_OPERATION = 1282;

  public static final int GL_OUT_OF_MEMORY = 1285;

  public static final int GL_CW = 2304;

  public static final int GL_CCW = 2305;

  public static final int GL_LINE_WIDTH = 2849;

  public static final int GL_ALIASED_POINT_SIZE_RANGE = 33901;

  public static final int GL_ALIASED_LINE_WIDTH_RANGE = 33902;

  public static final int GL_CULL_FACE_MODE = 2885;

  public static final int GL_FRONT_FACE = 2886;

  public static final int GL_DEPTH_RANGE = 2928;

  public static final int GL_DEPTH_WRITEMASK = 2930;

  public static final int GL_DEPTH_CLEAR_VALUE = 2931;

  public static final int GL_DEPTH_FUNC = 2932;

  public static final int GL_STENCIL_CLEAR_VALUE = 2961;

  public static final int GL_STENCIL_FUNC = 2962;

  public static final int GL_STENCIL_FAIL = 2964;

  public static final int GL_STENCIL_PASS_DEPTH_FAIL = 2965;

  public static final int GL_STENCIL_PASS_DEPTH_PASS = 2966;

  public static final int GL_STENCIL_REF = 2967;

  public static final int GL_STENCIL_VALUE_MASK = 2963;

  public static final int GL_STENCIL_WRITEMASK = 2968;

  public static final int GL_STENCIL_BACK_FUNC = 34816;

  public static final int GL_STENCIL_BACK_FAIL = 34817;

  public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818;

  public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819;

  public static final int GL_STENCIL_BACK_REF = 36003;

  public static final int GL_STENCIL_BACK_VALUE_MASK = 36004;

  public static final int GL_STENCIL_BACK_WRITEMASK = 36005;

  public static final int GL_VIEWPORT = 2978;

  public static final int GL_SCISSOR_BOX = 3088;

  public static final int GL_COLOR_CLEAR_VALUE = 3106;

  public static final int GL_COLOR_WRITEMASK = 3107;

  public static final int GL_UNPACK_ALIGNMENT = 3317;

  public static final int GL_PACK_ALIGNMENT = 3333;

  public static final int GL_MAX_TEXTURE_SIZE = 3379;

  public static final int GL_MAX_VIEWPORT_DIMS = 3386;

  public static final int GL_SUBPIXEL_BITS = 3408;

  public static final int GL_RED_BITS = 3410;

  public static final int GL_GREEN_BITS = 3411;

  public static final int GL_BLUE_BITS = 3412;

  public static final int GL_ALPHA_BITS = 3413;

  public static final int GL_DEPTH_BITS = 3414;

  public static final int GL_STENCIL_BITS = 3415;

  public static final int GL_POLYGON_OFFSET_UNITS = 10752;

  public static final int GL_POLYGON_OFFSET_FACTOR = 32824;

  public static final int GL_TEXTURE_BINDING_2D = 32873;

  public static final int GL_SAMPLE_BUFFERS = 32936;

  public static final int GL_SAMPLES = 32937;

  public static final int GL_SAMPLE_COVERAGE_VALUE = 32938;

  public static final int GL_SAMPLE_COVERAGE_INVERT = 32939;

  public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466;

  public static final int GL_COMPRESSED_TEXTURE_FORMATS = 34467;

  public static final int GL_DONT_CARE = 4352;

  public static final int GL_FASTEST = 4353;

  public static final int GL_NICEST = 4354;

  public static final int GL_GENERATE_MIPMAP_HINT = 33170;

  public static final int GL_BYTE = 5120;

  public static final int GL_UNSIGNED_BYTE = 5121;

  public static final int GL_SHORT = 5122;

  public static final int GL_UNSIGNED_SHORT = 5123;

  public static final int GL_INT = 5124;

  public static final int GL_UNSIGNED_INT = 5125;

  public static final int GL_FLOAT = 5126;

  public static final int GL_FIXED = 5132;

  public static final int GL_DEPTH_COMPONENT = 6402;

  public static final int GL_ALPHA = 6406;

  public static final int GL_RGB = 6407;

  public static final int GL_RGBA = 6408;

  public static final int GL_LUMINANCE = 6409;

  public static final int GL_LUMINANCE_ALPHA = 6410;

  public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 32819;

  public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 32820;

  public static final int GL_UNSIGNED_SHORT_5_6_5 = 33635;

  public static final int GL_FRAGMENT_SHADER = 35632;

  public static final int GL_VERTEX_SHADER = 35633;

  public static final int GL_MAX_VERTEX_ATTRIBS = 34921;

  public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;

  public static final int GL_MAX_VARYING_VECTORS = 36348;

  public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661;

  public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660;

  public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 34930;

  public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;

  public static final int GL_SHADER_TYPE = 35663;

  public static final int GL_DELETE_STATUS = 35712;

  public static final int GL_LINK_STATUS = 35714;

  public static final int GL_VALIDATE_STATUS = 35715;

  public static final int GL_ATTACHED_SHADERS = 35717;

  public static final int GL_ACTIVE_UNIFORMS = 35718;

  public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719;

  public static final int GL_ACTIVE_ATTRIBUTES = 35721;

  public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722;

  public static final int GL_SHADING_LANGUAGE_VERSION = 35724;

  public static final int GL_CURRENT_PROGRAM = 35725;

  public static final int GL_NEVER = 512;

  public static final int GL_LESS = 513;

  public static final int GL_EQUAL = 514;

  public static final int GL_LEQUAL = 515;

  public static final int GL_GREATER = 516;

  public static final int GL_NOTEQUAL = 517;

  public static final int GL_GEQUAL = 518;

  public static final int GL_ALWAYS = 519;

  public static final int GL_KEEP = 7680;

  public static final int GL_REPLACE = 7681;

  public static final int GL_INCR = 7682;

  public static final int GL_DECR = 7683;

  public static final int GL_INVERT = 5386;

  public static final int GL_INCR_WRAP = 34055;

  public static final int GL_DECR_WRAP = 34056;

  public static final int GL_VENDOR = 7936;

  public static final int GL_RENDERER = 7937;

  public static final int GL_VERSION = 7938;

  public static final int GL_EXTENSIONS = 7939;

  public static final int GL_NEAREST = 9728;

  public static final int GL_LINEAR = 9729;

  public static final int GL_NEAREST_MIPMAP_NEAREST = 9984;

  public static final int GL_LINEAR_MIPMAP_NEAREST = 9985;

  public static final int GL_NEAREST_MIPMAP_LINEAR = 9986;

  public static final int GL_LINEAR_MIPMAP_LINEAR = 9987;

  public static final int GL_TEXTURE_MAG_FILTER = 10240;

  public static final int GL_TEXTURE_MIN_FILTER = 10241;

  public static final int GL_TEXTURE_WRAP_S = 10242;

  public static final int GL_TEXTURE_WRAP_T = 10243;

  public static final int GL_TEXTURE = 5890;

  public static final int GL_TEXTURE_CUBE_MAP = 34067;

  public static final int GL_TEXTURE_BINDING_CUBE_MAP = 34068;

  public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069;

  public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070;

  public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071;

  public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072;

  public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073;

  public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074;

  public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076;

  public static final int GL_TEXTURE0 = 33984;

  public static final int GL_TEXTURE1 = 33985;

  public static final int GL_TEXTURE2 = 33986;

  public static final int GL_TEXTURE3 = 33987;

  public static final int GL_TEXTURE4 = 33988;

  public static final int GL_TEXTURE5 = 33989;

  public static final int GL_TEXTURE6 = 33990;

  public static final int GL_TEXTURE7 = 33991;

  public static final int GL_TEXTURE8 = 33992;

  public static final int GL_TEXTURE9 = 33993;

  public static final int GL_TEXTURE10 = 33994;

  public static final int GL_TEXTURE11 = 33995;

  public static final int GL_TEXTURE12 = 33996;

  public static final int GL_TEXTURE13 = 33997;

  public static final int GL_TEXTURE14 = 33998;

  public static final int GL_TEXTURE15 = 33999;

  public static final int GL_TEXTURE16 = 34000;

  public static final int GL_TEXTURE17 = 34001;

  public static final int GL_TEXTURE18 = 34002;

  public static final int GL_TEXTURE19 = 34003;

  public static final int GL_TEXTURE20 = 34004;

  public static final int GL_TEXTURE21 = 34005;

  public static final int GL_TEXTURE22 = 34006;

  public static final int GL_TEXTURE23 = 34007;

  public static final int GL_TEXTURE24 = 34008;

  public static final int GL_TEXTURE25 = 34009;

  public static final int GL_TEXTURE26 = 34010;

  public static final int GL_TEXTURE27 = 34011;

  public static final int GL_TEXTURE28 = 34012;

  public static final int GL_TEXTURE29 = 34013;

  public static final int GL_TEXTURE30 = 34014;

  public static final int GL_TEXTURE31 = 34015;

  public static final int GL_REPEAT = 10497;

  public static final int GL_CLAMP_TO_EDGE = 33071;

  public static final int GL_MIRRORED_REPEAT = 33648;

  public static final int GL_FLOAT_VEC2 = 35664;

  public static final int GL_FLOAT_VEC3 = 35665;

  public static final int GL_FLOAT_VEC4 = 35666;

  public static final int GL_INT_VEC2 = 35667;

  public static final int GL_INT_VEC3 = 35668;

  public static final int GL_INT_VEC4 = 35669;

  public static final int GL_BOOL = 35670;

  public static final int GL_BOOL_VEC2 = 35671;

  public static final int GL_BOOL_VEC3 = 35672;

  public static final int GL_BOOL_VEC4 = 35673;

  public static final int GL_FLOAT_MAT2 = 35674;

  public static final int GL_FLOAT_MAT3 = 35675;

  public static final int GL_FLOAT_MAT4 = 35676;

  public static final int GL_SAMPLER_2D = 35678;

  public static final int GL_SAMPLER_CUBE = 35680;

  public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338;

  public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339;

  public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340;

  public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341;

  public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922;

  public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373;

  public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975;

  public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;

  public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;

  public static final int GL_COMPILE_STATUS = 35713;

  public static final int GL_INFO_LOG_LENGTH = 35716;

  public static final int GL_SHADER_SOURCE_LENGTH = 35720;

  public static final int GL_SHADER_COMPILER = 36346;

  public static final int GL_SHADER_BINARY_FORMATS = 36344;

  public static final int GL_NUM_SHADER_BINARY_FORMATS = 36345;

  public static final int GL_LOW_FLOAT = 36336;

  public static final int GL_MEDIUM_FLOAT = 36337;

  public static final int GL_HIGH_FLOAT = 36338;

  public static final int GL_LOW_INT = 36339;

  public static final int GL_MEDIUM_INT = 36340;

  public static final int GL_HIGH_INT = 36341;

  public static final int GL_FRAMEBUFFER = 36160;

  public static final int GL_RENDERBUFFER = 36161;

  public static final int GL_RGBA4 = 32854;

  public static final int GL_RGB5_A1 = 32855;

  public static final int GL_RGB565 = 36194;

  public static final int GL_DEPTH_COMPONENT16 = 33189;

  public static final int GL_STENCIL_INDEX = 6401;

  public static final int GL_STENCIL_INDEX8 = 36168;

  public static final int GL_RENDERBUFFER_WIDTH = 36162;

  public static final int GL_RENDERBUFFER_HEIGHT = 36163;

  public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 36164;

  public static final int GL_RENDERBUFFER_RED_SIZE = 36176;

  public static final int GL_RENDERBUFFER_GREEN_SIZE = 36177;

  public static final int GL_RENDERBUFFER_BLUE_SIZE = 36178;

  public static final int GL_RENDERBUFFER_ALPHA_SIZE = 36179;

  public static final int GL_RENDERBUFFER_DEPTH_SIZE = 36180;

  public static final int GL_RENDERBUFFER_STENCIL_SIZE = 36181;

  public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048;

  public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049;

  public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050;

  public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051;

  public static final int GL_COLOR_ATTACHMENT0 = 36064;

  public static final int GL_DEPTH_ATTACHMENT = 36096;

  public static final int GL_STENCIL_ATTACHMENT = 36128;

  public static final int GL_NONE = 0;

  public static final int GL_FRAMEBUFFER_COMPLETE = 36053;

  public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;

  public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;

  public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 36057;

  public static final int GL_FRAMEBUFFER_UNSUPPORTED = 36061;

  public static final int GL_FRAMEBUFFER_BINDING = 36006;

  public static final int GL_RENDERBUFFER_BINDING = 36007;

  public static final int GL_MAX_RENDERBUFFER_SIZE = 34024;

  public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 1286;

  // Constructors

  public GLES20(){
  }
  // Methods

  public static void glActiveTexture(int arg1){
  }
  public static void glBindTexture(int arg1, int arg2){
  }
  public static void glBlendFunc(int arg1, int arg2){
  }
  public static void glClear(int arg1){
  }
  public static void glClearColor(float arg1, float arg2, float arg3, float arg4){
  }
  public static void glClearDepthf(float arg1){
  }
  public static void glClearStencil(int arg1){
  }
  public static void glColorMask(boolean arg1, boolean arg2, boolean arg3, boolean arg4){
  }
  public static void glCompressedTexImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8){
  }
  public static void glCompressedTexSubImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, java.nio.Buffer arg9){
  }
  public static void glCopyTexImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
  }
  public static void glCopyTexSubImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
  }
  public static void glCullFace(int arg1){
  }
  public static void glDeleteTextures(int arg1, int [] arg2, int arg3){
  }
  public static void glDeleteTextures(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glDepthFunc(int arg1){
  }
  public static void glDepthMask(boolean arg1){
  }
  public static void glDepthRangef(float arg1, float arg2){
  }
  public static void glDisable(int arg1){
  }
  public static void glDrawArrays(int arg1, int arg2, int arg3){
  }
  public static void glDrawElements(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glDrawElements(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public static void glEnable(int arg1){
  }
  public static void glFinish(){
  }
  public static void glFlush(){
  }
  public static void glFrontFace(int arg1){
  }
  public static void glGenTextures(int arg1, int [] arg2, int arg3){
  }
  public static void glGenTextures(int arg1, java.nio.IntBuffer arg2){
  }
  public static int glGetError(){
    return 0;
  }
  public static void glGetIntegerv(int arg1, int [] arg2, int arg3){
  }
  public static void glGetIntegerv(int arg1, java.nio.IntBuffer arg2){
  }
  public static java.lang.String glGetString(int arg1){
    return (java.lang.String) null;
  }
  public static void glHint(int arg1, int arg2){
  }
  public static void glLineWidth(float arg1){
  }
  public static void glPixelStorei(int arg1, int arg2){
  }
  public static void glPolygonOffset(float arg1, float arg2){
  }
  public static void glReadPixels(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.nio.Buffer arg7){
  }
  public static void glSampleCoverage(float arg1, boolean arg2){
  }
  public static void glScissor(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glStencilFunc(int arg1, int arg2, int arg3){
  }
  public static void glStencilMask(int arg1){
  }
  public static void glStencilOp(int arg1, int arg2, int arg3){
  }
  public static void glTexImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, java.nio.Buffer arg9){
  }
  public static void glTexParameterf(int arg1, int arg2, float arg3){
  }
  public static void glTexSubImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, java.nio.Buffer arg9){
  }
  public static void glViewport(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glBindBuffer(int arg1, int arg2){
  }
  public static void glBufferData(int arg1, int arg2, java.nio.Buffer arg3, int arg4){
  }
  public static void glBufferSubData(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public static void glDeleteBuffers(int arg1, int [] arg2, int arg3){
  }
  public static void glDeleteBuffers(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGenBuffers(int arg1, int [] arg2, int arg3){
  }
  public static void glGenBuffers(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGetBooleanv(int arg1, boolean [] arg2, int arg3){
  }
  public static void glGetBooleanv(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGetBufferParameteriv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetBufferParameteriv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glGetFloatv(int arg1, float [] arg2, int arg3){
  }
  public static void glGetFloatv(int arg1, java.nio.FloatBuffer arg2){
  }
  public static void glGetTexParameterfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glGetTexParameterfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glGetTexParameteriv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetTexParameteriv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static boolean glIsBuffer(int arg1){
    return false;
  }
  public static boolean glIsEnabled(int arg1){
    return false;
  }
  public static boolean glIsTexture(int arg1){
    return false;
  }
  public static void glTexParameterfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glTexParameterfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glTexParameteri(int arg1, int arg2, int arg3){
  }
  public static void glTexParameteriv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glTexParameteriv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glBlendEquation(int arg1){
  }
  public static void glBlendEquationSeparate(int arg1, int arg2){
  }
  public static void glBlendFuncSeparate(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glAttachShader(int arg1, int arg2){
  }
  public static void glBindAttribLocation(int arg1, int arg2, java.lang.String arg3){
  }
  public static void glBindFramebuffer(int arg1, int arg2){
  }
  public static void glBindRenderbuffer(int arg1, int arg2){
  }
  public static void glBlendColor(float arg1, float arg2, float arg3, float arg4){
  }
  public static int glCheckFramebufferStatus(int arg1){
    return 0;
  }
  public static void glCompileShader(int arg1){
  }
  public static int glCreateProgram(){
    return 0;
  }
  public static int glCreateShader(int arg1){
    return 0;
  }
  public static void glDeleteFramebuffers(int arg1, int [] arg2, int arg3){
  }
  public static void glDeleteFramebuffers(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glDeleteProgram(int arg1){
  }
  public static void glDeleteRenderbuffers(int arg1, int [] arg2, int arg3){
  }
  public static void glDeleteRenderbuffers(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glDeleteShader(int arg1){
  }
  public static void glDetachShader(int arg1, int arg2){
  }
  public static void glDisableVertexAttribArray(int arg1){
  }
  public static void glEnableVertexAttribArray(int arg1){
  }
  public static void glFramebufferRenderbuffer(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glFramebufferTexture2D(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public static void glGenerateMipmap(int arg1){
  }
  public static void glGenFramebuffers(int arg1, int [] arg2, int arg3){
  }
  public static void glGenFramebuffers(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGenRenderbuffers(int arg1, int [] arg2, int arg3){
  }
  public static void glGenRenderbuffers(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGetActiveAttrib(int arg1, int arg2, int arg3, int [] arg4, int arg5, int [] arg6, int arg7, int [] arg8, int arg9, byte [] arg10, int arg11){
  }
  public static void glGetActiveAttrib(int arg1, int arg2, int arg3, java.nio.IntBuffer arg4, java.nio.IntBuffer arg5, java.nio.IntBuffer arg6, byte arg7){
  }
  public static void glGetActiveUniform(int arg1, int arg2, int arg3, int [] arg4, int arg5, int [] arg6, int arg7, int [] arg8, int arg9, byte [] arg10, int arg11){
  }
  public static void glGetActiveUniform(int arg1, int arg2, int arg3, java.nio.IntBuffer arg4, java.nio.IntBuffer arg5, java.nio.IntBuffer arg6, byte arg7){
  }
  public static void glGetAttachedShaders(int arg1, int arg2, int [] arg3, int arg4, int [] arg5, int arg6){
  }
  public static void glGetAttachedShaders(int arg1, int arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4){
  }
  public static int glGetAttribLocation(int arg1, java.lang.String arg2){
    return 0;
  }
  public static void glGetFramebufferAttachmentParameteriv(int arg1, int arg2, int arg3, int [] arg4, int arg5){
  }
  public static void glGetFramebufferAttachmentParameteriv(int arg1, int arg2, int arg3, java.nio.IntBuffer arg4){
  }
  public static void glGetProgramiv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetProgramiv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static java.lang.String glGetProgramInfoLog(int arg1){
    return (java.lang.String) null;
  }
  public static void glGetRenderbufferParameteriv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetRenderbufferParameteriv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glGetShaderiv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetShaderiv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static java.lang.String glGetShaderInfoLog(int arg1){
    return (java.lang.String) null;
  }
  public static void glGetShaderPrecisionFormat(int arg1, int arg2, int [] arg3, int arg4, int [] arg5, int arg6){
  }
  public static void glGetShaderPrecisionFormat(int arg1, int arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4){
  }
  public static void glGetShaderSource(int arg1, int arg2, int [] arg3, int arg4, byte [] arg5, int arg6){
  }
  public static void glGetShaderSource(int arg1, int arg2, java.nio.IntBuffer arg3, byte arg4){
  }
  public static void glGetUniformfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glGetUniformfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glGetUniformiv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetUniformiv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static int glGetUniformLocation(int arg1, java.lang.String arg2){
    return 0;
  }
  public static void glGetVertexAttribfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glGetVertexAttribfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glGetVertexAttribiv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetVertexAttribiv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static boolean glIsFramebuffer(int arg1){
    return false;
  }
  public static boolean glIsProgram(int arg1){
    return false;
  }
  public static boolean glIsRenderbuffer(int arg1){
    return false;
  }
  public static boolean glIsShader(int arg1){
    return false;
  }
  public static void glLinkProgram(int arg1){
  }
  public static void glReleaseShaderCompiler(){
  }
  public static void glRenderbufferStorage(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glShaderBinary(int arg1, int [] arg2, int arg3, int arg4, java.nio.Buffer arg5, int arg6){
  }
  public static void glShaderBinary(int arg1, java.nio.IntBuffer arg2, int arg3, java.nio.Buffer arg4, int arg5){
  }
  public static void glShaderSource(int arg1, java.lang.String arg2){
  }
  public static void glStencilFuncSeparate(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glStencilMaskSeparate(int arg1, int arg2){
  }
  public static void glStencilOpSeparate(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glUniform1f(int arg1, float arg2){
  }
  public static void glUniform1fv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glUniform1fv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glUniform1i(int arg1, int arg2){
  }
  public static void glUniform1iv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glUniform1iv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glUniform2f(int arg1, float arg2, float arg3){
  }
  public static void glUniform2fv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glUniform2fv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glUniform2i(int arg1, int arg2, int arg3){
  }
  public static void glUniform2iv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glUniform2iv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glUniform3f(int arg1, float arg2, float arg3, float arg4){
  }
  public static void glUniform3fv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glUniform3fv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glUniform3i(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glUniform3iv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glUniform3iv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glUniform4f(int arg1, float arg2, float arg3, float arg4, float arg5){
  }
  public static void glUniform4fv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glUniform4fv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glUniform4i(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public static void glUniform4iv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glUniform4iv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glUniformMatrix2fv(int arg1, int arg2, boolean arg3, float [] arg4, int arg5){
  }
  public static void glUniformMatrix2fv(int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4){
  }
  public static void glUniformMatrix3fv(int arg1, int arg2, boolean arg3, float [] arg4, int arg5){
  }
  public static void glUniformMatrix3fv(int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4){
  }
  public static void glUniformMatrix4fv(int arg1, int arg2, boolean arg3, float [] arg4, int arg5){
  }
  public static void glUniformMatrix4fv(int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4){
  }
  public static void glUseProgram(int arg1){
  }
  public static void glValidateProgram(int arg1){
  }
  public static void glVertexAttrib1f(int arg1, float arg2){
  }
  public static void glVertexAttrib1fv(int arg1, float [] arg2, int arg3){
  }
  public static void glVertexAttrib1fv(int arg1, java.nio.FloatBuffer arg2){
  }
  public static void glVertexAttrib2f(int arg1, float arg2, float arg3){
  }
  public static void glVertexAttrib2fv(int arg1, float [] arg2, int arg3){
  }
  public static void glVertexAttrib2fv(int arg1, java.nio.FloatBuffer arg2){
  }
  public static void glVertexAttrib3f(int arg1, float arg2, float arg3, float arg4){
  }
  public static void glVertexAttrib3fv(int arg1, float [] arg2, int arg3){
  }
  public static void glVertexAttrib3fv(int arg1, java.nio.FloatBuffer arg2){
  }
  public static void glVertexAttrib4f(int arg1, float arg2, float arg3, float arg4, float arg5){
  }
  public static void glVertexAttrib4fv(int arg1, float [] arg2, int arg3){
  }
  public static void glVertexAttrib4fv(int arg1, java.nio.FloatBuffer arg2){
  }
  public static void glVertexAttribPointer(int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6){
  }
  public static void glVertexAttribPointer(int arg1, int arg2, int arg3, boolean arg4, int arg5, java.nio.Buffer arg6){
  }
}
