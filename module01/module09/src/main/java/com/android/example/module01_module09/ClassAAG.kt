package com.android.example.module01_module09

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module121_module3.ClassAAG = com.android.example.module06_module121_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module121_module3.ClassAAA = com.android.example.module06_module121_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module121_module3.ClassAAI = com.android.example.module06_module121_module3.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module06_module121_module3.ClassAAE = com.android.example.module06_module121_module3.ClassAAE()
	private 	val instance_var_1_4: com.android.example.module06_module121_module3.ClassAAH = com.android.example.module06_module121_module3.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module121_module3.ClassAAG,
		param1: com.android.example.module06_module121_module3.ClassAAC,
		param2: com.android.example.module06_module121_module3.ClassAAA,
		param3: com.android.example.module06_module121_module3.ClassAAJ
	) {
		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.dispose()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		}
		val local_var_2_4: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_4.onComplete()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.request(-2901166389627506901)

	}

	fun method1(
		param0: com.android.example.module06_module121_module3.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module121_module3.ClassAAH,
		param1: com.android.example.module06_module121_module3.ClassAAH,
		param2: com.android.example.module06_module121_module3.ClassAAJ
	) {
		param0.method3(io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module06_module121_module3.ClassAAG
	) {
		param0.method3(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.isDisposed()

	}
}
