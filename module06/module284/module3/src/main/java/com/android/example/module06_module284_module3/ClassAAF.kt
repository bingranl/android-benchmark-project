package com.android.example.module06_module284_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module284_module2.ClassAAJ = com.android.example.module06_module284_module2.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module06_module284_module2.ClassAAJ = com.android.example.module06_module284_module2.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module284_module5.ClassAAI = com.android.example.module06_module284_module5.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module06_module284_module5.ClassAAA = com.android.example.module06_module284_module5.ClassAAA()
	private 	val instance_var_1_4: com.android.example.module06_module284_module5.ClassAAD = com.android.example.module06_module284_module5.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module284_module5.ClassAAH
	) {
		for (iAb in 0..5) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.clear()

			}
			param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertNotSubscribed()

		}
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.isDisposed()

		param0.method0(io.reactivex.subscribers.TestSubscriber())

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver())

	}

	fun method1(
		param0: com.android.example.module06_module284_module5.ClassAAB,
		param1: com.android.example.module06_module284_module5.ClassAAD
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

	}

	fun method2(
		param0: com.android.example.module06_module284_module5.ClassAAC,
		param1: com.android.example.module06_module284_module2.ClassAAF
	) {
	}
}
