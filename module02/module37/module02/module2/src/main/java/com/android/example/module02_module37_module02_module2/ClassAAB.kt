package com.android.example.module02_module37_module02_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module02_module37_module02_module1.ClassAAD = com.android.example.module02_module37_module02_module1.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module02_module37_module02_module3.ClassAAD = com.android.example.module02_module37_module02_module3.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module02_module37_module02_module1.ClassAAD = com.android.example.module02_module37_module02_module1.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module02_module37_module02_module3.ClassAAI = com.android.example.module02_module37_module02_module3.ClassAAI()
	private 	val instance_var_1_4: com.android.example.module02_module37_module02_module1.ClassAAF = com.android.example.module02_module37_module02_module1.ClassAAF()

	fun method0(
		param0: com.android.example.module02_module37_module02_module3.ClassAAH,
		param1: com.android.example.module02_module37_module02_module3.ClassAAE,
		param2: com.android.example.module02_module37_module02_module1.ClassAAJ,
		param3: com.android.example.module02_module37_module02_module3.ClassAAB
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

		param0.method3("SomeString")

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

		}
		val local_var_2_5: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(89)
		local_var_2_5.toString()

	}

	fun method1(
		param0: com.android.example.module02_module37_module02_module1.ClassAAB,
		param1: com.android.example.module02_module37_module02_module3.ClassAAA,
		param2: com.android.example.module02_module37_module02_module1.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isDisposed()

	}

	fun method2(
		param0: com.android.example.module02_module37_module02_module3.ClassAAA,
		param1: com.android.example.module02_module37_module02_module1.ClassAAA
	) {
		param0.method3("SomeString")

		param0.method1("SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-4666885220348535363)

	}
}
